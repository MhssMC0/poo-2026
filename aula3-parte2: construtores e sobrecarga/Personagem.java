package aula3_parte2;
public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private int nivel;

    // Construtor padrão
    public Personagem() {
        this.nome = "Personagem";
        this.vida = 100;
        this.forca = 10;
        this.nivel = 1;
    }

    // Construtor parametrizado: nome, vida e nível
    public Personagem(String nome, int vida, int nivel) {
        setNome(nome);
        setVida(vida);
        this.forca = 10;
        setNivel(nivel);
    }

    // Construtor parametrizado mantendo também a força
    public Personagem(String nome, int vida, int forca, int nivel) {
        setNome(nome);
        setVida(vida);
        setForca(forca);
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

    // Ataque padrão: usa a força do personagem
    public void atacar(Personagem alvo) {
        atacar(alvo, forca);
    }

    // Ataque com dano definido
    public void atacar(Personagem alvo, int dano) {
        System.out.println(nome + " atacou " + alvo.getNome()
                + " causando " + dano + " de dano!");

        alvo.receberDano(dano);
    }

    // Método principal
    public static void main(String[] args) {

        System.out.println("=== CONSTRUTOR PADRÃO ===");

        // Criação usando o construtor sem parâmetros
        Personagem personagemPadrao = new Personagem();

        personagemPadrao.ficha();

        System.out.println("=== CONSTRUTOR PARAMETRIZADO ===");

        // Criação usando o construtor nome, vida e nível
        Personagem heroi = new Personagem("Herói", 100, 5);

        heroi.ficha();

        System.out.println("=== CONSTRUTOR COM FORÇA ===");

        // Criação usando o construtor nome, vida, força e nível
        Personagem chefe = new Personagem("Chefe", 100, 25, 7);

        chefe.ficha();

        System.out.println("=== ATAQUE PADRÃO ===");

        // Ataque padrão: utiliza a força do personagem
        heroi.atacar(chefe);

        System.out.println("Vida do Chefe: " + chefe.getVida());

        System.out.println("\n=== ATAQUE COM DANO DEFINIDO ===");

        // Ataque com dano definido manualmente
        heroi.atacar(chefe, 40);

        System.out.println("Vida do Chefe: " + chefe.getVida());

        System.out.println("\n=== BATALHA ===");

        while (heroi.estaVivo() && chefe.estaVivo()) {

            // Ataque padrão
            heroi.atacar(chefe);

            if (chefe.estaVivo()) {
                // Ataque com dano definido
                chefe.atacar(heroi, 25);
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