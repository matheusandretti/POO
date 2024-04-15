package Atividades_Revisao;
import java.util.Scanner;

public class Circulo {
    private double raio;
    private String cor;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a cor do círculo:");
        String cor = scanner.nextLine();
        Circulo circulo = new Circulo(raio, cor);

        System.out.println("Círculo criado:");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Cor: " + circulo.getCor());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        scanner.close();
    }
}
