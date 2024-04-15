package Atividade_02;
import java.util.Scanner;

//O problema estava na ordem dos Scanner, pois ao ler scanner.nextLine() por último estava sendo atribuido uma string vazia a variavel nome
class HelloWorld {
        public static void main(String[] args) {

            String nome;
            int idade;
            double peso;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe seus dados:  ");

            System.out.print("Nome: ");
            nome = scanner.nextLine();

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            System.out.print("Peso: ");
            peso = scanner.nextDouble();

            scanner.close();

            System.out.println("Nome "+ nome);
            System.out.println("Idade "+ idade + " anos");
            System.out.println("Peso "+ peso + " KG");
    }
}
