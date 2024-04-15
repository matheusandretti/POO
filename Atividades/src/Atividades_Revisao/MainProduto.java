package Atividades_Revisao;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 29.90, 50);
        Produto produto2 = new Produto("Calça Jeans", 89.90, 30);

        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
        produto1.setPreco(39.90);
        produto2.setQuantidadeEmEstoque(40);
        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
    }
}
