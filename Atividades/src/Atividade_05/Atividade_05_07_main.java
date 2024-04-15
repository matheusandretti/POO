package Atividade_05;

public class Atividade_05_07_main {
    public static void main(String[] args) {
        Atividade_05_07_Produto produto1 = new Atividade_05_07_Produto(123, "Camisa", 25.90, 10);

        produto1.adicionarEstoque(5); // Add 5 units to stock
        produto1.removerEstoque(3); // Remove 3 units from stock
        System.out.println("Quantidade atual em estoque do produto " + produto1.getDescricao() + ": " + produto1.getQuantidadeEmEstoque()); // Check stock
    }

    public static class Atividade_05_07_Produto {
        private int codigo;
        private String descricao;
        private double preco;
        private int quantidadeEmEstoque;
    
        public Atividade_05_07_Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
            this.codigo = codigo;
            this.descricao = descricao;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getDescricao() {
            return descricao;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidadeEmEstoque() {
            return quantidadeEmEstoque;
        }

        public void adicionarEstoque(int quantidade) {
            if (quantidade > 0) {
                this.quantidadeEmEstoque += quantidade;
                System.out.println("Estoque do produto " + getDescricao() + " atualizado com sucesso! Nova quantidade: " + getQuantidadeEmEstoque());
            } else {
                System.out.println("Quantidade inválida. A quantidade a ser adicionada deve ser maior que zero.");
            }
        }

        public void removerEstoque(int quantidade) {
            if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
                this.quantidadeEmEstoque -= quantidade;
                System.out.println("Estoque do produto " + getDescricao() + " atualizado com sucesso! Nova quantidade: " + getQuantidadeEmEstoque());
            } else {
                System.out.println("Remoção de estoque não realizada. Quantidade insuficiente ou valor inválido.");
            }
        }
    }
}
