package Atividade_05;
import java.util.Scanner;

public class Atividade_05_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont0a100 = 0;
        int cont101a200 = 0;
        int contAcima200 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            int number = scanner.nextInt();

            if (number >= 0 && number <= 100) {
                cont0a100++;
            } else if (number >= 101 && number <= 200) {
                cont101a200++;
            } else {
                contAcima200++;
            }
        }

        System.out.println("Números entre 0 e 100: " + cont0a100);
        System.out.println("Números entre 101 e 200: " + cont101a200);
        System.out.println("Números maiores que 200: " + contAcima200);
    }
}

