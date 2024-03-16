import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio05 {
    private Map<String, Aluno> alunos;

    public Exercicio05() {
        alunos = new HashMap<>();
    }

    public void cadastrarAluno(String matricula, String nome) {
        Aluno aluno = new Aluno(matricula, nome);
        alunos.put(matricula, aluno);
    }

    public Aluno selecionarAluno(String matricula) {
        return alunos.get(matricula);
    }

    public void alterarAluno(String matricula, String novoNome) {
        Aluno aluno = alunos.get(matricula);
        if (aluno != null) {
            aluno.setNome(novoNome);
        }
    }

    public void excluirAluno(String matricula) {
        alunos.remove(matricula);
    }

    public void exibirEstatisticas() {
        int totalAlunos = alunos.size();
        int aprovados = 20; 
        int reprovados = 10; 

        System.out.println("Total de alunos registrados: " + totalAlunos);
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados: " + reprovados);
    }

    public static void main(String[] args) {
        Exercicio05 manager = new Exercicio05();
        Scanner scanner = new Scanner(System.in);

        
        manager.cadastrarAluno("123", "João");
        manager.cadastrarAluno("456", "Maria");

        
        manager.exibirEstatisticas();

        
        scanner.close();
    }
}

class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
