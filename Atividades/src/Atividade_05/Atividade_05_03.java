package Atividade_05;
import java.util.Scanner;

public class Atividade_05_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de idade para dias");
        System.out.println("Digite sua idade, expressa em ano, meses e dias");
        System.out.print("Digite sua idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite os meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite os dias: ");
        int dias = scanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Sua idade em dias é: " + totalDias);
    }
}
