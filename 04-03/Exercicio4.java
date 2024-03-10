/*
 * ArrayList é uma estrutura de dados útil para armazenar e manipular coleções 
 * e é uma boa escolha para este sistema simples de registro, 
 * e eu tambem bem por cima as outras opções.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    private static ArrayList<String> lista = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int o = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar atendimento");
            System.out.println("2 - Remover atendimento");
            System.out.println("3 - Finalizar sistema");
            o = scanner.nextInt();

            switch (o) {
                case 1:
                    cadastrarAtendimento();
                    break;
                case 2:
                    removerAtendimento();
                    break;
                case 3:
                    System.out.println("Sistema finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (o != 3);

        scanner.close();
    }

    private static void cadastrarAtendimento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome da pessoa: ");
        String nome = scanner.nextLine();
        lista.add(nome);
        System.out.println("Atendimento registrado.");
        scanner.close();
    }

    private static void removerAtendimento() {
        if (!lista.isEmpty()) {
            String nome = lista.remove(0);
            System.out.println("Pessoa removida do atendimento: " + nome);
        } else {
            System.out.println("Não há atendimentos para remover.");
        }
    }
}