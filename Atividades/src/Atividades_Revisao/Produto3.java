package Atividades_Revisao;

import java.util.Scanner;

public class Produto3 {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto3(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEmEstoque = 0;
    }
    public Produto3(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }
    public Produto3(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método para criar o produto:");
        System.out.println("1. Apenas nome");
        System.out.println("2. Nome e preço");
        System.out.println("3. Nome, preço e quantidade em estoque");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        Produto3 produto;

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do produto: ");
                String nome1 = scanner.nextLine();
                produto = new Produto3(nome1);
                break;
            case 2:
                System.out.print("Digite o nome do produto: ");
                String nome2 = scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
                double preco2 = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer
                produto = new Produto3(nome2, preco2);
                break;
            case 3:
                System.out.print("Digite o nome do produto: ");
                String nome3 = scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
                double preco3 = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer
                System.out.print("Digite a quantidade em estoque do produto: ");
                int quantidade3 = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                produto = new Produto3(nome3, preco3, quantidade3);
                break;
            default:
                System.out.println("Opção inválida. Saindo do programa.");
                return;
        }

        System.out.println("Produto criado:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());

        scanner.close();
    }
}