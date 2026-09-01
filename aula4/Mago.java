package aula4;

public class Mago extends Personagem {
    private int mana;

    // Construtor
    public Mago(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
        setMana(50);
    }

    // Getter da mana
    public int getMana() {
        return mana;
    }

    // Setter da mana com validação
    public void setMana(int mana) {
        if (mana < 0) {
            System.out.println("Erro: a mana não pode ser negativa.");
            return;
        }

        this.mana = mana;
    }

    // Sobrescrevendo ficha()
    @Override
    public void ficha() {
        super.ficha();
        System.out.println("Mana: " + mana);
        System.out.println("--------------------");
    }
}