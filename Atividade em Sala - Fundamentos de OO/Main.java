/*
Dominio: Empresa

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

/*
Criterios atingidos: 
Atributos fechados (private em Java, _ em Python), acessados por getters e setters ou properties.
Construtor que exige os dados indispensáveis e reaproveita os setters para validar.
Pelo menos duas regras de validação que recusem valores inválidos.
A demonstração roda e mostra uma criação válida, uma recusa e as duas formas de criação.

Criterios não atingidos:
Duas formas de criar o objeto: sobrecarga em Java ou parâmetros padrão em Python.
Duas classes, uma delas usando objetos da outra.

*/
