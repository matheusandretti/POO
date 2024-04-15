package Atividade_03;

import java.util.Scanner;

public class Atividade_03_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de Notas:");
        System.out.print("Digite a primeira nota: ");
        double value1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double value2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double value3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double value4 = scanner.nextDouble();

        double soma = value1 + value2 + value3 + value4;
        double media = soma/4;

        System.out.println("A media das notas é de: " + media);

        scanner.close();
    }
}
