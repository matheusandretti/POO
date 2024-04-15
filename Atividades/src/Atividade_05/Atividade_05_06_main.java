package Atividade_05;

public class Atividade_05_06_main {
    public static void main(String[] args) {
        Atividade_05_06 conta1 = new Atividade_05_06(100.0, "12345");

        conta1.depositar(50.0);
        conta1.sacar(30.0);
        System.out.println("Saldo atual da conta 1: " + conta1.consultarSaldo());
    }
}