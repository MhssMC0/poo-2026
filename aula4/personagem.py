# ============================================================
# USO DE IA

# Ferramenta utilizada: ChatGPT

# Utilizacao: 
# - geracao de código e explicacao dos conceirtos de
# - Programacao Orientada a Objetos.

# Modificacoes/validacoes manuais: 
# - conferi a herança entre as calsses,
# - conferi a implementacao dos metodos, 
# - conferi a validacao dos atributos, 
# - conferi a implementacao do programa principal.
# ============================================================


# Classe Item
class Item:

    # Construtor
    def __init__(self, nome, bonus):
        self._nome = nome

        if bonus < 0:
            raise ValueError("O bonus nao pode ser negativo.")

        self._bonus = bonus

    # Getter do nome
    @property
    def nome(self):
        return self._nome

    # Getter do bonus
    @property
    def bonus(self):
        return self._bonus

    # Exibe a descricao do item
    def __str__(self):
        return f"{self.nome} (+{self.bonus})"


# Classe Personagem
class Personagem:

    # Construtor com valores padrao
    def __init__(self, nome="Personagem", vida=100, forca=10, nivel=1):
        self.nome = nome
        self.vida = vida
        self.forca = forca
        self.nivel = nivel

        # Inventario do personagem
        self.inventario = []

    # Getter e Setter do nome
    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, nome):
        if not nome or nome.strip() == "":
            raise ValueError("O nome nao pode ser vazio.")

        self._nome = nome

    # Getter e Setter da vida
    @property
    def vida(self):
        return self._vida

    @vida.setter
    def vida(self, vida):
        if vida < 0 or vida > 100:
            raise ValueError("A vida deve estar entre 0 e 100.")

        self._vida = vida

    # Getter e Setter da forca
    @property
    def forca(self):
        return self._forca

    @forca.setter
    def forca(self, forca):
        self._forca = forca

    # Getter e Setter do nivel
    @property
    def nivel(self):
        return self._nivel

    @nivel.setter
    def nivel(self, nivel):
        if nivel < 1:
            raise ValueError("O nivel deve ser no minimo 1.")

        self._nivel = nivel

    # Metodo para pegar um item
    def pegar(self, item):
        self.inventario.append(item)

    # Metodo para receber dano
    def receberDano(self, dano):
        self.vida -= dano

        if self.vida < 0:
            self.vida = 0

    # Metodo para verificar se o personagem esta vivo
    def estaVivo(self):
        return self.vida > 0

    # Metodo para exibir a ficha do personagem
    def ficha(self):
        print(f"Nome: {self.nome}")
        print(f"Vida: {self.vida}")
        print(f"Forca: {self.forca}")
        print(f"Nivel: {self.nivel}")

        print("Inventario:")

        if len(self.inventario) == 0:
            print("Nenhum item")

        else:
            for item in self.inventario:
                print(f"- {item}")

        print("--------------------")

    # Metodo para atacar
    def atacar(self, alvo, dano=None):

        # Se nao informar o dano, usa a forca
        if dano is None:
            dano = self.forca

        print(
            f"{self.nome} atacou {alvo.nome} "
            f"causando {dano} de dano!"
        )

        alvo.receberDano(dano)


# ============================================================
# Classe Mago
# Herda de Personagem
# ============================================================

class Mago(Personagem):

    # Construtor
    def __init__(self, nome="Mago", vida=100, forca=10, nivel=1):

        # Chama o construtor da classe Personagem
        super().__init__(nome, vida, forca, nivel)

        # Mana inicial
        self.mana = 50

    # Getter e Setter da mana
    @property
    def mana(self):
        return self._mana

    @mana.setter
    def mana(self, mana):
        if mana < 0:
            raise ValueError("A mana nao pode ser negativa.")

        self._mana = mana

    # Sobrescrevendo ficha()
    def ficha(self):

        # Mostra as informacoes da classe Personagem
        super().ficha()

        # Mostra a mana do Mago
        print(f"Mana: {self.mana}")
        print("--------------------")


# ============================================================
# Classe Guerreiro
# Herda de Personagem
# ============================================================

class Guerreiro(Personagem):

    # Construtor
    def __init__(self, nome="Guerreiro", vida=100, forca=10, nivel=1):

        # Chama o construtor da classe Personagem
        super().__init__(nome, vida, forca, nivel)

        # Defesa inicial
        self.defesa = 5

    # Getter e Setter da defesa
    @property
    def defesa(self):
        return self._defesa

    @defesa.setter
    def defesa(self, defesa):
        if defesa < 0:
            raise ValueError("A defesa nao pode ser negativa.")

        self._defesa = defesa

    # Sobrescrevendo receberDano()
    def receberDano(self, dano):

        # Calcula o dano efetivo
        dano_efetivo = max(0, dano - self.defesa)

        print(f"Dano recebido: {dano}")
        print(f"Defesa: {self.defesa}")
        print(f"Dano efetivo: {dano_efetivo}")

        # Aplica o dano usando o metodo da classe Personagem
        super().receberDano(dano_efetivo)

    # Sobrescrevendo ficha()
    def ficha(self):

        # Mostra as informacoes da classe Personagem
        super().ficha()

        # Mostra a defesa do Guerreiro
        print(f"Defesa: {self.defesa}")
        print("--------------------")


# ============================================================
# PROGRAMA PRINCIPAL
# ============================================================

if __name__ == '__main__':

    print("=== EXERCICIO 1 - ITEM ===")

    # Criando o item
    espada = Item("Espada de Aco", 3)

    print(espada)

    print("\n=== EXERCICIO 2 - MAGO ===")

    # Criando o Mago
    mago = Mago(
        nome="Elara",
        vida=100,
        forca=10,
        nivel=5
    )

    # Mago pegando a espada
    mago.pegar(espada)

    # Exibindo ficha
    mago.ficha()

    print("\n=== EXERCICIO 3 - GUERREIRO ===")

    # Criando o Guerreiro
    guerreiro = Guerreiro(
        nome="Bran",
        vida=100,
        forca=15,
        nivel=5
    )

    # Exibindo ficha
    guerreiro.ficha()

    print("Aplicando 8 de dano no Guerreiro...")

    guerreiro.receberDano(8)

    print(f"Vida restante do Guerreiro: {guerreiro.vida}")

    print("\n=== EXERCICIO 4 - VALIDACAO DA MANA ===")

    # Tentando colocar mana negativa
    try:
        mago.mana = -10

    except ValueError as erro:
        print(f"Erro: {erro}")

    print("\n=== FICHA FINAL DO MAGO ===")

    mago.ficha()