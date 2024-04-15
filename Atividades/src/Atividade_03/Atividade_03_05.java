package Atividade_03;

import java.util.Scanner;

public class Atividade_03_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de valores:");
        System.out.print("Digite o primeiro valor: ");
        double value1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double value2 = scanner.nextDouble();

        double soma = value1 + value2;
        double sub = value1 - value2;
        double div = value1/value2;
        double multi = value1*value2;

        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("A diferença dos valores é de: " + sub);
        System.out.println("O resultado da divisão é de: " + div);
        System.out.println("O resultado da multiplicação é de: " + multi);

        scanner.close();
    }
}
