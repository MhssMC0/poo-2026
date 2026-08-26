# Classe Personagem
class Personagem:

    # Construtor da classe
    def __init__(self, nome, vida, forca, nivel):
        self.nome = nome
        self.vida = vida
        self._forca = forca
        self.nivel = nivel

    # Getter e Setter do nome
    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, nome):
        if not nome or nome.strip() == "":
            print("Erro: o nome não pode ser vazio.")
            return

        self._nome = nome

    # Getter e Setter da vida
    @property
    def vida(self):
        return self._vida

    @vida.setter
    def vida(self, vida):
        if vida < 0 or vida > 100:
            print("Erro: a vida deve estar entre 0 e 100.")
            return

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
            print("Erro: o nível deve ser no mínimo 1.")
            return

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

    # Método para atacar outro personagem
    def atacar(self, alvo):
        print(
            f"{self.nome} atacou {alvo.nome} "
            f"causando {self.forca} de dano!"
        )

        alvo.receberDano(self.forca)


# Simulação de batalha entre dois personagens
if __name__ == '__main__':

    heroi = Personagem("Herói", 100, 20, 5)
    chefe = Personagem("Chefe", 150, 25, 7)

    # Exibição da ficha inicial
    print("=== FICHA INICIAL ===")
    heroi.ficha()
    chefe.ficha()

    # Loop para simular a batalha
    print("=== BATALHA ===")

    while heroi.estaVivo() and chefe.estaVivo():
        heroi.atacar(chefe)

        if chefe.estaVivo():
            chefe.atacar(heroi)

    # Exibição da ficha final
    print("\n=== FICHA FINAL ===")
    heroi.ficha()
    chefe.ficha()

    # Verificação do resultado
    if heroi.estaVivo():
        print("O Herói venceu a batalha!")
    else:
        print("O Chefe venceu a batalha!")