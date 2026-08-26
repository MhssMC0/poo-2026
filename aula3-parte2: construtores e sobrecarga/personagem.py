# Classe Personagem
class Personagem:

    # Construtor com valores padrão
    def __init__(self, nome="Personagem", vida=100, forca=10, nivel=1):
        self.nome = nome
        self.vida = vida
        self.forca = forca
        self.nivel = nivel

    # Getter e Setter do nome
    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, nome):
        if not nome or nome.strip() == "":
            raise ValueError("O nome não pode ser vazio.")

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

    # Getter e Setter da força
    @property
    def forca(self):
        return self._forca

    @forca.setter
    def forca(self, forca):
        self._forca = forca

    # Getter e Setter do nível
    @property
    def nivel(self):
        return self._nivel

    @nivel.setter
    def nivel(self, nivel):
        if nivel < 1:
            raise ValueError("O nível deve ser no mínimo 1.")

        self._nivel = nivel

    # Método para receber dano
    def receberDano(self, dano):
        self.vida -= dano

        if self.vida < 0:
            self.vida = 0

    # Método para verificar se o personagem está vivo
    def estaVivo(self):
        return self.vida > 0

    # Método para exibir a ficha do personagem
    def ficha(self):
        print(f"Nome: {self.nome}")
        print(f"Vida: {self.vida}")
        print(f"Força: {self.forca}")
        print(f"Nível: {self.nivel}")
        print("--------------------")

    # Ataque com parâmetro opcional
    def atacar(self, alvo, dano=None):

        # Se não informar o dano, usa a força
        if dano is None:
            dano = self.forca

        print(
            f"{self.nome} atacou {alvo.nome} "
            f"causando {dano} de dano!"
        )

        alvo.receberDano(dano)


# Programa principal
if __name__ == '__main__':

    print("=== CONSTRUTOR PADRÃO ===")

    # Construtor sem parâmetros
    personagemPadrao = Personagem()

    personagemPadrao.ficha()

    print("=== CONSTRUTOR PARAMETRIZADO ===")

    # Construtor com nome, vida e nível
    # A força recebe o valor padrão 10
    heroi = Personagem(
        nome="Herói",
        vida=100,
        nivel=5
    )

    heroi.ficha()

    print("=== CONSTRUTOR COM FORÇA ===")

    # Construtor com nome, vida, força e nível
    chefe = Personagem(
        nome="Chefe",
        vida=100,
        forca=25,
        nivel=7
    )

    chefe.ficha()

    print("=== ATAQUE PADRÃO ===")

    # Sem informar o dano.
    # O personagem usa sua força.
    heroi.atacar(chefe)

    print(f"Vida do Chefe: {chefe.vida}")

    print("\n=== ATAQUE COM DANO DEFINIDO ===")

    # Informando o dano manualmente
    heroi.atacar(chefe, 40)

    print(f"Vida do Chefe: {chefe.vida}")

    print("\n=== BATALHA ===")

    while heroi.estaVivo() and chefe.estaVivo():

        # Ataque padrão
        heroi.atacar(chefe)

        if chefe.estaVivo():
            # Ataque com dano definido
            chefe.atacar(heroi, 25)

    print("\n=== FICHA FINAL ===")

    heroi.ficha()
    chefe.ficha()

    if heroi.estaVivo():
        print("O Herói venceu a batalha!")
    else:
        print("O Chefe venceu a batalha!")