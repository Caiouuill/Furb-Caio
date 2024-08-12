public class App {
    public static void main(String[] args) throws Exception {
        Contabancaria c1 = new Contabancaria();
        Contabancaria c2 = new Contabancaria();

        c1.depositar(1000);
        c1.depositar(700);

        c2.depositar(5000);

        c2.sacar(3000);

        c2.transferir(c1, 1800);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        
    }
}
