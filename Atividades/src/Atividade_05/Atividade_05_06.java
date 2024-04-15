package Atividade_05;

public class Atividade_05_06 {
    private double saldo;
    private String numeroConta;

    public Atividade_05_06(double saldoInicial, String numeroConta) {
        this.saldo = saldoInicial;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! Saldo atual: " + consultarSaldo());
        } else {
            System.out.println("Valor inválido. O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Saldo atual: " + consultarSaldo());
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}