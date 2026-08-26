package aula3_parte1;
public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private int nivel;

    // Construtor da classe
    public Personagem(String nome, int vida, int forca, int nivel) {
        setNome(nome);
        setVida(vida);
        this.forca = forca;
        setNivel(nivel);
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Setter do nome com validação
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: o nome não pode ser vazio.");
            return;
        }

        this.nome = nome;
    }

    // Getter da vida
    public int getVida() {
        return vida;
    }

    // Setter da vida com validação
    public void setVida(int vida) {
        if (vida < 0 || vida > 100) {
            System.out.println("Erro: a vida deve estar entre 0 e 100.");
            return;
        }

        this.vida = vida;
    }

    // Getter da força
    public int getForca() {
        return forca;
    }

    // Setter da força
    public void setForca(int forca) {
        this.forca = forca;
    }

    // Getter do nível
    public int getNivel() {
        return nivel;
    }

    // Setter do nível com validação
    public void setNivel(int nivel) {
        if (nivel < 1) {
            System.out.println("Erro: o nível deve ser no mínimo 1.");
            return;
        }

        this.nivel = nivel;
    }

    // Função para receber dano
    public void receberDano(int dano) {
        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    // Função para verificar se o personagem está vivo
    public boolean estaVivo() {
        return vida > 0;
    }

    // Função para exibir a ficha do personagem
    public void ficha() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
        System.out.println("Nível: " + nivel);
        System.out.println("--------------------");
    }

    // Função para atacar outro personagem
    public void atacar(Personagem alvo) {
        System.out.println(nome + " atacou " + alvo.getNome()
                + " causando " + forca + " de dano!");

        alvo.receberDano(forca);
    }

    // Função principal para simular uma batalha
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Herói", 100, 20, 5);
        Personagem chefe = new Personagem("Chefe", 150, 25, 7);

        System.out.println("=== FICHA INICIAL ===");
        heroi.ficha();
        chefe.ficha();

        System.out.println("=== BATALHA ===");

        while (heroi.estaVivo() && chefe.estaVivo()) {
            heroi.atacar(chefe);

            if (chefe.estaVivo()) {
                chefe.atacar(heroi);
            }
        }

        System.out.println("\n=== FICHA FINAL ===");
        heroi.ficha();
        chefe.ficha();

        if (heroi.estaVivo()) {
            System.out.println("O Herói venceu a batalha!");
        } else {
            System.out.println("O Chefe venceu a batalha!");
        }
    }
}