Estruturas de dados.
  -um conjuntod e dados armazenados e organizados especificadamente.

qual é a sua importancia?
  -permite manipular e alocar dados especificos em diferentes linguargens

a eu ja não vo fazer essa ultima não

import java.util.*;

public class Exec2 {
    List<String> nomess = new ArrayList<>();
    static String[] nomes = new String[10];
    static Scanner Teclado = new Scanner(System.in);

    public static void Cadastrar() {

        boolean vdd = true; 
        while (vdd) { 
            for (int i = 0; i >= 0; i++) { // Remova o ponto-e-vírgula extra
                System.out.print("Digite o nome para cadastrar: ");
                String nome = Teclado.nextLine();
                int j = i;
                nomes[j] = nome;
            }
        
            vdd = false;  
        }
    }

    public static void ListarNomes(){
        for(int i = 0; i > nomes.length ; i ++){
            System.out.print("Numero "+i+": "+nomes[i]); 
    }
    }

    public static void main(String[] args) {
        // Seu código principal aqui
       switch (args) {
        case 1:
            
            break;
       
        default:
            break;
       }
       
       
        Cadastrar();
    }
}
