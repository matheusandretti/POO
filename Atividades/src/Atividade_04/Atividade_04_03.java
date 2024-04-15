package Atividade_04;
import java.util.Scanner;

public class Atividade_04_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário:");
        String username = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String password = scanner.nextLine();

        if (username.equals("usuario") && password.equals("senha123")) {
            System.out.println("Login bem-sucedido");
        } else {
            System.out.println("Nome de usuário ou senha incorretos");
        }

        scanner.close();
    }
}
