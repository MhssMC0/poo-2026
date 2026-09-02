package aula4;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private int nivel;

    private List<Item> inventario;

    public Personagem() {
        this.nome = "Personagem";
        this.vida = 100;
        this.forca = 10;
        this.nivel = 1;
        this.inventario = new ArrayList<>();
    }

    public Personagem(String nome, int vida, int nivel) {
        setNome(nome);
        setVida(vida);
        this.forca = 10;
        setNivel(nivel);
        this.inventario = new ArrayList<>();
    }

    public Personagem(String nome, int vida, int forca, int nivel) {
        setNome(nome);
        setVida(vida);
        setForca(forca);
        setNivel(nivel);
        this.inventario = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: o nome não pode ser vazio.");
            return;
        }

        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0 || vida > 100) {
            System.out.println("Erro: a vida deve estar entre 0 e 100.");
            return;
        }

        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 1) {
            System.out.println("Erro: o nível deve ser no mínimo 1.");
            return;
        }

        this.nivel = nivel;
    }

    public void pegar(Item item) {
        inventario.add(item);
        System.out.println(nome + " pegou o item: " + item.descricao());
    }

    public void receberDano(int dano) {
        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

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

    public void atacar(Personagem alvo) {
        atacar(alvo, forca);
    }

    public void atacar(Personagem alvo, int dano) {
        System.out.println(nome + " atacou " + alvo.getNome()
                + " causando " + dano + " de dano!");

        alvo.receberDano(dano);
    }
}
