package aula4;

public class Item {
    private String nome;
    private int bonus;

    // Construtor
    public Item(String nome, int bonus) {
        this.nome = nome;

        if (bonus < 0) {
            System.out.println("Erro: o bonus não pode ser negativo.");
            this.bonus = 0;
        } else {
            this.bonus = bonus;
        }
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Getter do bonus
    public int getBonus() {
        return bonus;
    }

    // Descrição do item
    public String descricao() {
        return nome + " (+" + bonus + ")";
    }
}