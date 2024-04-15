package Atividade_03;
import java.util.Scanner;

public class Atividade_03_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Subtração de dois valores:");
            System.out.print("Digite o primeiro valor:");
            double value1 = scanner.nextDouble();

            System.out.print("Digite o segundo valor:");
            double value2 = scanner.nextDouble();

            double total = value1 - value2;

            System.out.println("A subtração dos dois valores resulta em: " + total);

            scanner.close();
    }

}
