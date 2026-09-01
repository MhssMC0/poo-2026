package aula4;

public class Guerreiro extends Personagem {
    private int defesa;

    // Construtor
    public Guerreiro(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
        this.defesa = 5;
    }

    // Getter da defesa
    public int getDefesa() {
        return defesa;
    }

    // Setter da defesa
    public void setDefesa(int defesa) {
        if (defesa < 0) {
            System.out.println("Erro: a defesa não pode ser negativa.");
            return;
        }

        this.defesa = defesa;
    }

    // Sobrescrevendo receberDano()
    @Override
    public void receberDano(int dano) {
        int danoEfetivo = Math.max(0, dano - defesa);

        System.out.println(
            getNome() + " recebeu " + dano +
            " de dano, mas sua defesa reduziu para " +
            danoEfetivo + "."
        );

        super.receberDano(danoEfetivo);
    }

    // Sobrescrevendo ficha()
    @Override
    public void ficha() {
        super.ficha();
        System.out.println("Defesa: " + defesa);
        System.out.println("--------------------");
    }
}