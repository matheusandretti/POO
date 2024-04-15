package Atividade_05;

public class Atividade_05_01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 15 == 0){
                System.out.println("FizzBuzz\t");
            } else if (i % 3 == 0) {
                System.out.print("Fizz\t");
            } else if (i % 5 == 0) {
                System.out.print("Buzz\t");
            } else {
                System.out.print(i+"\t");
            }
            System.out.print(" ");
        }
    }
}

