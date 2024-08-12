public class Contabancaria {
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Numero Negativos... ");
        }
        double i =getSaldo();
        double ii = i+valor;
        setSaldo(ii);

    }

    public void sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Numero negativo... ");
        }

        if ((getSaldo() - valor) < 0) {
            throw new IllegalArgumentException("Saldo Indisponivel... ");
        }

        setSaldo(getSaldo() - valor);

    }

    public void transferir(Contabancaria contadestino, double valor) {
        if(valor <0){
            throw new IllegalArgumentException("Numero Negativo... ");
        }
        if((getSaldo() - valor)< 0){
            throw new IllegalArgumentException("Saldo indisponivel... ");
        }
        
        contadestino.setSaldo(contadestino.getSaldo()+valor);
    }
}
