# Classe Personagem
class Personagem:
    # Construtor da classe
    def __init__(self, nome, vida, forca):
        self.nome = nome
        self.vida = vida
        self.forca = forca

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
        print("--------------------")

    # Método para atacar outro personagem
    def atacar(self, alvo):
        print(f"{self.nome} atacou {alvo.nome} causando {self.forca} de dano!")
        alvo.receberDano(self.forca)

# Simulação de batalha entre dois personagens
if __name__ == '__main__':
    heroi = Personagem("Herói", 100, 20) #Criação do personagem herói
    chefe = Personagem("Chefe", 150, 25) #Criação do personagem chefe

    #Exibição da ficha inicial dos personagens
    print("=== FICHA INICIAL ===")
    heroi.ficha()
    chefe.ficha()

    #Loop para simular a batalha
    print("=== BATALHA ===")

    while heroi.estaVivo() and chefe.estaVivo():
        heroi.atacar(chefe)

        if chefe.estaVivo():
            chefe.atacar(heroi)

    #Exibição da ficha final dos personagens
    print("\n=== FICHA FINAL ===")
    heroi.ficha()
    chefe.ficha()

    #Verificação do resultado da batalha
    if heroi.estaVivo():
        print("O Herói venceu a batalha!")
    else:
        print("O Chefe venceu a batalha!")