import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // Criando uma lista vinculada para armazenar os nomes
        LinkedList<String> listaNomes = new LinkedList<>();

        // Criando um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Loop principal
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar um nome");
            System.out.println("2. Listar todos os nomes");
            System.out.println("3. Finalizar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome a ser cadastrado: ");
                    String nome = scanner.next();
                    listaNomes.add(nome);
                    System.out.println("Nome cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Nomes cadastrados:");
                    for (String n : listaNomes) {
                        System.out.println(n);
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
