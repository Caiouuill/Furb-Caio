import java.util.ArrayList;
import java.util.Scanner;

class Tarefas {
    private ArrayList<String> tarefas;

    public Tarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void addtarefa(String tarefa) {
        tarefas.add(tarefa);
    }

    public void completeTarefas() {
        if (!tarefas.isEmpty()) {
            System.out.println("Tarefa concluída: " + tarefas.remove(0));
        } else {
            System.out.println("Não há tarefas pendentes.");
        }
    }

    public void verAProximaTarefa() {
        if (!tarefas.isEmpty()) {
            System.out.println("Próxima tarefa: " + tarefas.get(0));
        } else {
            System.out.println("Não há tarefas pendentes.");
        }
    }
}

public class Atividade {
    public static void main(String[] args) {
        Tarefas tarefa = new Tarefas();
        Scanner scanner = new Scanner(System.in);
        int e;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Concluir tarefa");
            System.out.println("3. Visualizar próxima tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            e = scanner.nextInt();

            switch (e) {
                case 1:
                    System.out.print("Digite a nova tarefa: ");
                    scanner.nextLine(); // Limpar o buffer
                    String novaTarefa = scanner.nextLine();
                    tarefa.addtarefa(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    tarefa.completeTarefas();
                    break;
                case 3:
                    tarefa.verAProximaTarefa();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (e != 4);
    }
}
