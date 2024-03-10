import java.util.Scanner;

public class Exercicio2 {
    private static final int MAX_SIZE = 10;
    private static String[] names = new String[MAX_SIZE];
    private static int T = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S;

        do {
            System.out.println("\n1. Cadastrar");
            System.out.println("2. Listar todos os nomes");
            System.out.println("3. Alterar");
            System.out.println("4. Remover");
            System.out.println("5. Finalizar");
            System.out.print("Digite: ");
            S = scanner.nextInt();

            switch (S) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listarTodosOsNomes();
                    break;
                case 3:
                    alterar();
                    break;
                case 4:
                    remover();
                    break;
                case 5:
                    System.out.println("Terminando Programa.");
                    break;
                default:
                    System.out.println("Resposta invalida");
            }
        } while (S != 5);

        scanner.close();
    }

    private static void cadastrar() {
        if (T < MAX_SIZE) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome: ");
            names[T] = scanner.nextLine();
            T++;
            System.out.println("Nome Adicionado!");
        } else {
            System.out.println("Array Está cheio.");
        }
    }

    private static void listarTodosOsNomes() {
        if (T == 0) {
            System.out.println("Sem nomes cadastrados.");
        } else {
            System.out.println("Nomes:");
            for (int i = 0; i < T; i++) {
                System.out.println((i + 1) + ". " + names[i]);
            }
        }
    }

    private static void alterar() {
        if (T == 0) {
            System.out.println("Sem nomes para alterar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero do nome para alterar: ");
        int index = scanner.nextInt() - 1;

        if (index < 0 || index >= T) {
            System.out.println("Numero do nome invalidpo.");
            return;
        }

        System.out.print("Digite o nome nome: ");
        String n = scanner.next();
        names[index] = n;
        System.out.println("nome alterado com sucesso!");
    }

    private static void remover() {
        if (T == 0) {
            System.out.println("Sem nomes para remover.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero do nome para remover: ");
        int index = scanner.nextInt() - 1;

        if (index < 0 || index >= T) {
            System.out.println("Numero do nome invalido.");
            return;
        }

        for (int i = index; i < T - 1; i++) {
            names[i] = names[i + 1];
        }
        T--;
        System.out.println("nome removido com sucesso!");
    }
}