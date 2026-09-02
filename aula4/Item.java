package aula4;

public class Item {
    private String nome;
    private int bonus;

    public Item(String nome, int bonus) {
        this.nome = nome;

        if (bonus < 0) {
            System.out.println("Erro: o bonus não pode ser negativo.");
            this.bonus = 0;
        } else {
            this.bonus = bonus;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getBonus() {
        return bonus;
    }

    public String descricao() {
        return nome + " (+" + bonus + ")";
    }
}
