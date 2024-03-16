import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private String nome;
    private String segmento;
    private ArrayList<String> caracteristicas;

    public Produto(String nome, String segmento) {
        this.nome = nome;
        this.segmento = segmento;
        this.caracteristicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void adicionarCaracteristica(String caracteristica) {
        this.caracteristicas.add(caracteristica);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Segmento: " + segmento + ", Características: " + caracteristicas;
    }
}

public class Arrai {
    private ArrayList<Produto> produtos;

    public Arrai() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(String nome, String segmento) {
        Produto produto = new Produto(nome, segmento);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void selecionarTodosOsRegistros() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void quantidadeDeSegmentos() {
        ArrayList<String> segmentos = new ArrayList<>();
        for (Produto produto : produtos) {
            if (!segmentos.contains(produto.getSegmento())) {
                segmentos.add(produto.getSegmento());
            }
        }

        for (String segmento : segmentos) {
            int quantidade = 0;
            for (Produto produto : produtos) {
                if (produto.getSegmento().equals(segmento)) {
                    quantidade++;
                }
            }
            System.out.println("Segmento: " + segmento + ", Quantidade de produtos: " + quantidade);
        }
    }

    public void alterarDados(String nomeAtual, String novoNome, String novoSegmento) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nomeAtual)) {
                produto.setNome(novoNome);
                produto.setSegmento(novoSegmento);
                System.out.println("Dados alterados com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public void removerProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtos.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public static void main(String[] args) {
        Arrai gerenciadorProdutos = new Arrai();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Selecionar todos os registros");
            System.out.println("3. Quantidade de segmentos");
            System.out.println("4. Alterar dados");
            System.out.println("5. Remover produto");
            System.out.println("6. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o segmento do produto: ");
                    String segmento = scanner.nextLine();
                    gerenciadorProdutos.cadastrarProduto(nome, segmento);
                    break;
                case 2:
                    gerenciadorProdutos.selecionarTodosOsRegistros();
                    break;
                case 3:
                    gerenciadorProdutos.quantidadeDeSegmentos();
                    break;
                case 4:
                    System.out.print("Digite o nome do produto atual: ");
                    String nomeAtual = scanner.nextLine();
                    System.out.print("Digite o novo nome do produto: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo segmento do produto: ");
                    String novoSegmento = scanner.nextLine();
                    gerenciadorProdutos.alterarDados(nomeAtual, novoNome, novoSegmento);
                    break;
                case 5:
                    System.out.print("Digite o nome do produto a ser removido: ");
                    String nomer = scanner.nextLine();
                    gerenciadorProdutos.removerProduto(nomer);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        scanner.close();
    }
}