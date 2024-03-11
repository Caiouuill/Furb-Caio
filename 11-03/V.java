import java.util.Scanner;
import java.util.Vector;

class Registro {
    private String nome;
    private String valor;

    public Registro(String nome, String valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Registro registro = (Registro) o;
        return nome.equals(registro.nome);
    }

    @Override
    public String toString() {
        return "Registro{" +
                "nome='" + nome + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}

public class App {

    public static void main(String[] args) {
        Vector<Registro> registros = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar");
            System.out.println("2. Selecionar todos os registros");
            System.out.println("3. Pesquisar por termo");
            System.out.println("4. Alterar dados");
            System.out.println("5. Remover");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome:");
                    String nome = scanner.next();
                    if (containsRegistro(registros, nome)) {
                        System.out.println("Registro já existente.");
                        break;
                    }
                    System.out.println("Informe o valor:");
                    String valor = scanner.next();
                    registros.add(new Registro(nome, valor));
                    break;
                case 2:
                    for (Registro registro : registros) {
                        System.out.println(registro);
                    }
                    break;
                case 3:
                    System.out.println("Informe o termo:");
                    String termo = scanner.next();
                    for (Registro registro : registros) {
                        if (registro.getNome().contains(termo)) {
                            System.out.println(registro);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Informe o nome do registro a ser alterado:");
                    String nomeAlterar = scanner.next();
                    Registro registroAlterar = getRegistroByName(registros, nomeAlterar);
                    if (registroAlterar == null) {
                        System.out.println("Registro não encontrado.");
                        break;
                    }
                    System.out.println("Informe o novo valor:");
                    String novoValor = scanner.next();
                    registroAlterar.setValor(novoValor);
                    break;
                case 5:
                    System.out.println("Informe o nome do registro a ser removido:");
                    String nomeRemover = scanner.next();
                    Registro registroRemover = getRegistroByName(registros, nomeRemover);
                    if (registroRemover == null) {
                        System.out.println("Registro não encontrado.");
                        break;
                    }
                    registros.remove(registroRemover);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    private static boolean containsRegistro(Vector<Registro> registros, String nome) {
        for (Registro registro : registros) {
            if (registro.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    private static Registro getRegistroByName(Vector<Registro> registros, String nome) {
        for (Registro registro : registros) {
            if (registro.getNome().equals(nome)) {
                return registro;
            }
        }
        return null;
    }

    
}