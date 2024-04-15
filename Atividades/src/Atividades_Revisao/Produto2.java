package Atividades_Revisao;
import java.util.ArrayList;
import java.util.Scanner;

public class Produto2 {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    public Produto2(String nome, double preco, int quantidadeEmEstoque) {
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
    public void exibirInformacoes() {
        System.out.println("=======================");
        System.out.println("Informações do Produto:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar um novo produto");
            System.out.println("2. Atualizar preço ou quantidade de um produto existente");
            System.out.println("3. Exibir detalhes de um produto");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do produto:");
                String nome = scanner.nextLine();
                System.out.println("Digite o preço do produto:");
                double preco = scanner.nextDouble();
                System.out.println("Digite a quantidade em estoque do produto:");
                int quantidade = scanner.nextInt();

                Produto novoProduto = new Produto(nome, preco, quantidade);
                estoque.add(novoProduto);
                System.out.println("Produto adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Digite o nome do produto que deseja atualizar:");
                String nome = scanner.nextLine();
                System.out.println("Digite o novo preço do produto:");
                double novoPreco = scanner.nextDouble();
                System.out.println("Digite a nova quantidade em estoque do produto:");
                int novaQuantidade = scanner.nextInt();

                for (Produto produto : estoque) {
                    if (produto.getNome().equalsIgnoreCase(nome)) {
                        produto.setPreco(novoPreco);
                        produto.setQuantidadeEmEstoque(novaQuantidade);
                        System.out.println("Produto atualizado com sucesso!");
                        break;
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Digite o nome do produto que deseja exibir:");
                String nome = scanner.nextLine();

                for (Produto produto : estoque) {
                    if (produto.getNome().equalsIgnoreCase(nome)) {
                        produto.exibirInformacoes();
                        break;
                    }
                }
            } else if (opcao == 4) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
