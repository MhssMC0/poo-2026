/*
 Link da interação de IA: https://chatgpt.com/share/6a99726b-a418-83e9-9fd0-022a25cff66a
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

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

/*
 * RESULTADO DA EXECUCAO - CRITERIO 6
 *
 * Criterios atingidos:
 *
 * 1. Uma superclasse e pelo menos duas subclasses:
 *    ATINGIDO.
 *    A superclasse e Funcionario e as subclasses sao Peao e Patrao.
 *
 * 2. Metodo declarado na superclasse e implementado de forma
 *    propria por cada subclasse:
 *    ATINGIDO.
 *    O metodo trabalhar() e declarado em Funcionario e implementado
 *    de forma diferente em Peao e Patrao.
 *
 * 3. Construtor de cada subclasse chamando super e acrescentando
 *    ao menos um atributo proprio:
 *    ATINGIDO.
 *    Os construtores de Peao e Patrao chamam super(nome, CPF, idade)
 *    e possuem o atributo proprio anos_trabalhando.
 *
 * 4. Um metodo sobrescrito que reaproveita a versao herdada:
 *    ATINGIDO.
 *    O metodo mostrarDados() de Peao e Patrao chama super.mostrarDados()
 *    e depois acrescenta as informacoes proprias da subclasse.
 *
 * 5. Colecao do tipo da superclasse com objetos das duas subclasses,
 *    percorrida por um unico laco, sem instanceof ou isinstance:
 *    ATINGIDO.
 *    Foi utilizada uma ArrayList<Funcionario> contendo objetos Peao
 *    e Patrao. A lista e percorrida por um unico laco.
 *
 * 6. A demonstracao roda e a saida mostra o mesmo comando produzindo
 *    comportamentos diferentes:
 *    ATINGIDO.
 *    O metodo trabalhar() e chamado pelo mesmo comando dentro do laco,
 *    mas produz resultados diferentes:
 *    - Peao: "O peao esta trabalhando na empresa."
 *    - Patrao: "O patrao esta administrando a empresa."
 *
 *
 * Trecho que deu mais trabalho:
 * A parte que deu mais trabalho foi entender como utilizar a heranca,
 * a classe abstrata e o polimorfismo juntos.
 *
 * Como foi resolvido:
 * A classe Funcionario foi utilizada como superclasse abstrata.
 * Peao e Patrao herdaram dela e implementaram o metodo trabalhar()
 * de maneiras diferentes. Depois, os objetos foram colocados em uma
 * ArrayList<Funcionario> e percorridos pelo mesmo laco.
 *
 * Uso de IA:
 * Foi utilidada para criar os comentários dos arquivos e revisar o código
 * para eu saber se estava de acordo com todos os 6 critérios da atividade.
 */