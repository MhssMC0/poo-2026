public class Personagem {
    String nome;
    int vida;
    int forca;

    //Classe Personagem com atributos nome, vida e força
    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    //Função para receber dano, subtraindo a vida do personagem
    public void receberDano(int dano) {
        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    //Função para verificar se o personagem está vivo
    public boolean estaVivo() {
        return vida > 0;
    }

    //Função para exibir a ficha do personagem
    public void ficha() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        System.out.println("--------------------");
    }

    //Função para atacar outro personagem, causando dano igual à força do atacante
    public void atacar(Personagem alvo) {
        System.out.println(nome + " atacou " + alvo.nome + " causando " + forca + " de dano!");
        alvo.receberDano(forca);
    }

    //Função principal para simular uma batalha entre dois personagens
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Herói", 100, 20); //Criação do personagem herói
        Personagem chefe = new Personagem("Chefe", 150, 25); //Criação do personagem chefe

        System.out.println("=== FICHA INICIAL ==="); //Exibição da ficha inicial dos personagens
        heroi.ficha();
        chefe.ficha();

        System.out.println("=== BATALHA ===");

        //Loop para simular a batalha entre o herói e o chefe
        while (heroi.estaVivo() && chefe.estaVivo()) {
            heroi.atacar(chefe);

            if (chefe.estaVivo()) {
                chefe.atacar(heroi);
            }
        }

        System.out.println("\n=== FICHA FINAL ==="); //Exibição da ficha final dos personagens após a batalha
        heroi.ficha();
        chefe.ficha();

        //Verificação do resultado da batalha
        if (heroi.estaVivo()) {
            System.out.println("O Herói venceu a batalha!");
        } else {
            System.out.println("O Chefe venceu a batalha!");
        }
    }
}