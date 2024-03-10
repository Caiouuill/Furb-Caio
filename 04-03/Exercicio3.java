import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

    private List<Product> produtos = new ArrayList<>();

    public static void main(String[] args) {
        Exercicio3 manager = new Exercicio3();
        Scanner scanner = new Scanner(System.in);
        int e = 0;

        while (e != 6) {
            System.out.println("1. Registrar produto");
            System.out.println("2. Listar todos os produtos");
            System.out.println("3. Procurar produtos");
            System.out.println("4. Atuaizar produtos");
            System.out.println("5. Remover produtos");
            System.out.println("6. Finalizar.");
            System.out.print("Digite: ");
            e = scanner.nextInt();

            switch (e) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.print("Digite o valor do produto: ");
                    double valor = scanner.nextDouble();
                    manager.RegistrarProdutos(nome, valor);
                    break;
                case 2:
                    manager.ListarProdutos();
                    ;
                    break;
                case 3:
                    System.out.print("Digite o nome: ");
                    scanner.nextLine();
                    String termo = scanner.nextLine();
                    manager.ProcurarProdutos(termo);
                    break;
                case 4:
                    System.out.print("Digite o nome antigo: ");
                    scanner.nextLine();
                    String anitgonome = scanner.nextLine();
                    System.out.print("Digite o novo nome: ");
                    String novonome = scanner.nextLine();
                    System.out.print("Digite o novo valor: ");
                    double novovalor = scanner.nextDouble();
                    manager.AtualizarProdutos(anitgonome, novonome, novovalor);
                    break;
                case 5:
                    System.out.print("Digite o nome do produto para remover: ");
                    scanner.nextLine();
                    String nomeremover = scanner.nextLine();
                    manager.RemoverProdutos(nomeremover);
                    break;
                case 6:
                    manager.FinalizarProg();
                    break;
                default:
                    System.out.println("Digito invalido.");
            }
        }

        scanner.close();
    }

    public void RegistrarProdutos(String nome, double valor) {
        produtos.add(new Product(nome, valor));
    }

    public void ListarProdutos() {
        for (Product product : produtos) {
            System.out.println("Nome: " + product.getName() + ", Valor: " + product.getValue());
        }
    }

    public void ProcurarProdutos(String termo) {
        for (Product product : produtos) {
            if (product.getName().contains(termo)) {
                System.out.println("Nome: " + product.getName() + ", Valor: " + product.getValue());
            }
        }
    }

    public void AtualizarProdutos(String oldName, String newName, double newValue) {
        for (int i = 0; i < produtos.size(); i++) {
            Product product = produtos.get(i);
            if (product.getName().equals(oldName)) {
                produtos.set(i, new Product(newName, newValue));
                break;
            }
        }
    }

    public void RemoverProdutos(String name) {
        produtos.removeIf(product -> product.getName().equals(name));
    }


    public void FinalizarProg() {
        System.out.println("Finalizando programa");
        System.exit(0);
    }
}

class Product {
    private String name;
    private double value;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}