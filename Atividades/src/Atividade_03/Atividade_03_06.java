package Atividade_03;

import java.util.Scanner;
/*Faça um sistema que pergunte para o usuario o nome, preço de produto, após isso pergunte
qual o percentual de desconto, a saida precisa ser o nome do produto e o novo preço.
 */
public class Atividade_03_06 {
    public static void main(String[] args) {

        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de desconto:");

        System.out.println("Nome do Produto: ");
        nome = scanner.nextLine();
        System.out.print("Preço do Produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double desconto = scanner.nextDouble();

        preco = preco - (preco/100*desconto);

        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço descontado: " + preco);

        scanner.close();
    }
}
