package aula4;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private int nivel;

    // Inventário do personagem
    private List<Item> inventario;

    // Construtor padrão
    public Personagem() {
        this.nome = "Personagem";
        this.vida = 100;
        this.forca = 10;
        this.nivel = 1;
        this.inventario = new ArrayList<>();
    }

    // Construtor parametrizado: nome, vida e nível
    public Personagem(String nome, int vida, int nivel) {
        setNome(nome);
        setVida(vida);
        this.forca = 10;
        setNivel(nivel);
        this.inventario = new ArrayList<>();
    }

    // Construtor parametrizado mantendo também a força
    public Personagem(String nome, int vida, int forca, int nivel) {
        setNome(nome);
        setVida(vida);
        setForca(forca);
        setNivel(nivel);
        this.inventario = new ArrayList<>();
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

    // Adiciona um item ao inventário
    public void pegar(Item item) {
        inventario.add(item);
        System.out.println(nome + " pegou o item: " + item.descricao());
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

        System.out.println("Inventário:");

        if (inventario.isEmpty()) {
            System.out.println("Nenhum item.");
        } else {
            for (Item item : inventario) {
                System.out.println("- " + item.descricao());
            }
        }

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
}