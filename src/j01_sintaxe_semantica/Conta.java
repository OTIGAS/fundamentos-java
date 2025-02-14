package j01_sintaxe_semantica;

public class Conta {
    // Variavel da classe Conta
    double saldo=10.0;

    public void sacar (Double valor) {
        // Variavel do Método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        // Disponível em toda classe
        System.out.println("Saldo de: R$" + saldo);
    }
}
