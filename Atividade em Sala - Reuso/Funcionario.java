public abstract class Funcionario {

    private String nome;
    private String CPF;
    private int idade;

    public Funcionario(String nome, String CPF, int idade) {
        setNome(nome);
        setCPF(CPF);
        setIdade(idade);
    }

    public String getNome() {
        return this.nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    // Mantendo o método idade() exatamente como no código original
    public int idade() {
        return this.idade;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Erro: o nome não pode ser vazio.");
        }

        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setIdade(int idade) {
        if (idade < 18) {
            System.out.println("Erro: idade não pode ser monor que 18 anos.");
            return;
        }

        this.idade = idade;
    }

    // Método que será implementado de forma diferente
    // em cada classe filha.
    public abstract void trabalhar();

    // Método comum que poderá ser reutilizado pelas subclasses
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Idade: " + idade());
    }
}