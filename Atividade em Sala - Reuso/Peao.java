/*
 * Dominio: Funcionarios de uma empresa.
 *
 * Superclasse: Funcionario
 * Subclasse: Peao
 *
 * O Peao possui como caracteristica propria a quantidade de
 * anos trabalhados.
 *
 * Metodo abstrato herdado: trabalhar()
 *
 * O metodo trabalhar() e sobrescrito para representar o
 * comportamento especifico do Peao.
 *
 * Uso de IA: foi utilizada para auxiliar na organizacao,
 * explicacao e documentacao do codigo.
 */

public class Peao extends Funcionario {

    private int anos_trabalhando;

    public Peao(String nome, String CPF, int idade, int anos_trabalhando) {
        super(nome, CPF, idade);
        setAnosTrabalhando(anos_trabalhando);
    }

    public int getAnosTrabalhando() {
        return this.anos_trabalhando;
    }

    public void setAnosTrabalhando(int anos_trabalhando) {
        this.anos_trabalhando = anos_trabalhando;
    }

    // Implementação própria do método abstrato
    @Override
    public void trabalhar() {
        System.out.println("O peão está trabalhando na empresa.");
    }

    // Reutiliza o método da classe pai
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Anos de Trabalho: " + getAnosTrabalhando());
    }
}