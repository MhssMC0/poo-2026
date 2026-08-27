public class Peao{
    private String nome;
    private String CPF;
    private int idade;
    private int anos_trabalhando;

    public Peao(String nome, String CPF, int idade, int anos_trabalhando){
        setNome(nome);
        setCPF(CPF);
        setIdade(idade);
        setAnosTrabalhando(anos_trabalhando);
    }

    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.CPF;
    }

    public int idade(){
        return this.idade;
    }

    public int getAnosTrabalhando(){
        return this.anos_trabalhando;
    }

    public void setNome(String nome){
        if(nome == null || nome.isEmpty()){
            System.out.println("Erro: o nome não pode ser vazio.");
        }

        this.nome = nome;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public void setIdade(int idade){
        if(idade < 18){
            System.out.println("Erro: idade não pode ser monor que 18 anos.");
            return;
        }

        this.idade = idade;
    }

    public void setAnosTrabalhando(int anos_trabalhando){
        this.anos_trabalhando = anos_trabalhando;
    }
}