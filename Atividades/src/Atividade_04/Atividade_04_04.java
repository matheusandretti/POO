package Atividade_04;
import java.util.Scanner;

public class Atividade_04_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        int max;
        if (num1 > num2){
            max = num1;
        } else {
            max = num2;
        }

        System.out.println("O maior número é: " + max);

        scanner.close();
    }
}
