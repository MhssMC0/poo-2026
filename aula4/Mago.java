package aula4;

public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
        setMana(50);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            System.out.println("Erro: a mana não pode ser negativa.");
            return;
        }

        this.mana = mana;
    }

    @Override
    public void ficha() {
        super.ficha();
        System.out.println("Mana: " + mana);
        System.out.println("--------------------");
    }
}
