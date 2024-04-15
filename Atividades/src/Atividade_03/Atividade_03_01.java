package Atividade_03;
import java.util.Scanner;

public class Atividade_03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Soma de 3 valores:");

        System.out.print("Digite o primeiro valor:");
        double value1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor:");
        double value2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor:");
        double value3 = scanner.nextDouble();

        double total = value1 + value2 + value3;

        System.out.println("A soma dos três valores é: " + total);

        scanner.close();
    }
}
