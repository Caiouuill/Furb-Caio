import java.util.Scanner;
import java.util.Vector;

class Registro {
    private String nome;

    public Registro(String nome) {
        this.nome = nome;

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
                "nome='" + nome + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

public class V {

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
                    registros.add(new Registro(nome));
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
                    System.out.print("Digte o nome para alteração:");
                    String nomeA = scanner.next();
                    System.out.println("Feito");

                    registroAlterar.setNome(nomeA);
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
