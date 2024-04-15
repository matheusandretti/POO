package Atividades_Revisao;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2023, "Branco");
        carro1.exibirInformacoes();

        carro1.setCor("Prata");
        carro1.exibirInformacoes();
    }
}
