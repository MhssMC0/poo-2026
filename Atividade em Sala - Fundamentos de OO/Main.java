/*
Dominio: EmpresaDeJogos

1. Classes: Peao, Patrao, Main

2. Atributos: nome, CPF, idade, anos_trabalhando

3. Validações:
- O nome não pode ser vazio.
- A idade não pode ser menor que 18 anos.
- Para ser patrão da empresa precisa ter pelo menos 30 anos de contribuição.

*/

public class Main{
public static void main(String[] args){
    Peao CLT = new Peao("Umberto Ferreira da Silva Machado", "911.432.207-11", 28, 4);
    Peao CLT2 = new Peao("", "123.456.789-10", 17, 0);
    Patrao patrao = new Patrao("João da Silva", "123.456.789-10", 45, 35);
    Patrao patrao2 = new Patrao("", "987.654.321-00", 50, 25);

    System.out.println("CLT 1");
    System.out.println("Nome: " + CLT.getNome());
    System.out.println("CPF: " + CLT.getCPF());
    System.out.println("Idade: " + CLT.idade());
    System.out.println("Anos de Trabalho: " + CLT.getAnosTrabalhando());

    System.out.println("CLT 2");
    System.out.println("Nome: " + CLT2.getNome());
    System.out.println("CPF: " + CLT2.getCPF());
    System.out.println("Idade: " + CLT2.idade());
    System.out.println("Anos de Trabalho: " + CLT2.getAnosTrabalhando());

    System.out.println("PATRÃO 1");
    System.out.println("Nome: " + patrao.getNome());
    System.out.println("CPF: " + patrao.getCPF());
    System.out.println("Idade: " + patrao.idade());
    System.out.println("Anos de Trabalho: " + patrao.getAnosTrabalhando());

    System.out.println("PATRÃO 2");
    System.out.println("Nome: " + patrao2.getNome());
    System.out.println("CPF: " + patrao2.getCPF());
    System.out.println("Idade: " + patrao2.idade());
    System.out.println("Anos de Trabalho: " + patrao2.getAnosTrabalhando());  
    }  
}
