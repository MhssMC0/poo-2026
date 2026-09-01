package aula4;

/*
 * USO DE IA:
 *
 * Ferramenta utilizada: ChatGPT
 *
 * Finalidade:
 * - Auxílio na geração e organização do código;
 * - Explicação dos conceitos de herança, composição,
 *   encapsulamento, sobrescrita e validação.
 *
 * Modificações/validações realizadas manualmente:
 * - Conferência dos atributos e métodos solicitados;
 * - Conferência dos construtores;
 * - Conferência da herança entre Mago/Guerreiro e Personagem;
 * - Conferência do funcionamento do inventário;
 * - Conferência do cálculo de dano do Guerreiro;
 * - Conferência das mensagens e resultados apresentados.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EXERCÍCIO 1 E 4: ITEM E MAGO ===");

        // Criando o item
        Item espada = new Item("Espada de Aço", 3);

        System.out.println("Item criado: " + espada.descricao());

        // Criando o Mago
        Mago elara = new Mago("Elara", 100, 5);

        // Mago pega a espada
        elara.pegar(espada);

        // Exibindo ficha
        elara.ficha();


        System.out.println("=== EXERCÍCIO 3: GUERREIRO ===");

        // Criando o Guerreiro
        Guerreiro bran = new Guerreiro("Bran", 100, 5);

        System.out.println("Vida inicial do Bran: " + bran.getVida());

        // Aplicando 8 de dano
        bran.receberDano(8);

        // Deve ficar com 97 de vida
        System.out.println("Vida do Bran após receber 8 de dano: "
                + bran.getVida());

        bran.ficha();


        System.out.println("=== VALIDAÇÃO DA MANA ===");

        System.out.println("Mana inicial da Elara: "
                + elara.getMana());

        // Tentativa de colocar mana negativa
        elara.setMana(-10);

        // A mana continua em 50
        System.out.println("Mana da Elara após tentar colocar -10: "
                + elara.getMana());
    }
}