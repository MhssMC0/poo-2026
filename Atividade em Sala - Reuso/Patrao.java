/*
 * Dominio: Funcionarios de uma empresa.
 *
 * Superclasse: Funcionario
 * Subclasse: Patrao
 *
 * O Patrao possui como caracteristica propria a quantidade de
 * anos trabalhados.
 *
 * Metodo abstrato herdado: trabalhar()
 *
 * O metodo trabalhar() e sobrescrito para representar o
 * comportamento especifico do Patrao, que administra a empresa.
 *
 * Uso de IA: foi utilizada para auxiliar na organizacao,
 * explicacao e documentacao do codigo.
 */

public class Patrao extends Funcionario {

    private int anos_trabalhando;

    public Patrao(String nome, String CPF, int idade, int anos_trabalhando) {
        super(nome, CPF, idade);
        setAnosTrabalhando(anos_trabalhando);
    }

    public int getAnosTrabalhando() {
        return this.anos_trabalhando;
    }

    public void setAnosTrabalhando(int anos_trabalhando) {
        if (anos_trabalhando < 30) {
            System.out.println(
                "Erro: para ser patrão da empresa precisa ter pelo menos 30 anos de contribuição."
            );
            return;
        }

        this.anos_trabalhando = anos_trabalhando;
    }

    // Implementação diferente da classe Peao
    @Override
    public void trabalhar() {
        System.out.println("O patrão está administrando a empresa.");
    }

    // Reutiliza o método herdado
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Anos de Trabalho: " + getAnosTrabalhando());
    }
}