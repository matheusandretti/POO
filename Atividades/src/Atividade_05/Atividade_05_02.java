package Atividade_05;
import java.util.Scanner;

public class Atividade_05_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial de patinhos: ");
        int num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i + " patinhos foram passear");
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");

            if (i == 1) {
                System.out.println("Mas nenhum patinho voltou de lá");
            } else {
                System.out.println("Mas só " + (i - 1) + " patinhos voltaram de lá");
            }

            System.out.println();
        }

        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("Na beira do mar");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá");
        System.out.println("E os " + num + " patinhos voltaram de lá");
    }
}
