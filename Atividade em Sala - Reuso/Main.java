import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        Dominio: EmpresaDeJogos

        Superclasse:
        - Funcionario

        Subclasses:
        - Peao
        - Patrao

        Atributos:
        - nome
        - CPF
        - idade
        - anos_trabalhando

        Validações:
        - O nome não pode ser vazio.
        - A idade não pode ser menor que 18 anos.
        - Para ser patrão da empresa precisa ter pelo menos
          30 anos de contribuição.

        Polimorfismo:
        - Funcionario possui o método trabalhar().
        - Peao implementa trabalhar() de uma forma.
        - Patrao implementa trabalhar() de outra forma.

        Reuso:
        - Peao e Patrao reutilizam mostrarDados() através
          de super.mostrarDados().
        */

        Peao CLT = new Peao(
            "Umberto Ferreira da Silva Machado",
            "911.432.207-11",
            28,
            4
        );

        Peao CLT2 = new Peao(
            "",
            "123.456.789-10",
            17,
            0
        );

        Patrao patrao = new Patrao(
            "João da Silva",
            "123.456.789-10",
            45,
            35
        );

        Patrao patrao2 = new Patrao(
            "",
            "987.654.321-00",
            50,
            25
        );

        // Uma única coleção usando a superclasse
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(CLT);
        funcionarios.add(CLT2);
        funcionarios.add(patrao);
        funcionarios.add(patrao2);

        // Um único laço para Peao e Patrao
        for (Funcionario funcionario : funcionarios) {

            System.out.println("-----------------------------");

            funcionario.mostrarDados();

            // O comportamento muda de acordo com o objeto
            funcionario.trabalhar();
        }

        System.out.println("-----------------------------");
    }
}