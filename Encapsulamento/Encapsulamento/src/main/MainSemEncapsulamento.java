package main;

import objetos.PessoaSemEncapsulamento;

public class MainSemEncapsulamento {

    public static void main(String[] args) {

        PessoaSemEncapsulamento pessoa = new
                PessoaSemEncapsulamento();

        pessoa.nome = "Sr." + "Cleiton";
        pessoa.time = "Hepta gaucho";
    }
}
