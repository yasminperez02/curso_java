package Exercicios;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.println("Digite o código do produto e a quantidade: ");
        int cod = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;

        if (cod == 1) {
           total = quantidade * 4.00;
            System.out.printf("Total: %.2f%n", total);
        }
        else if (cod == 2) {
            total = quantidade * 4.50;
            System.out.printf("Total: %.2f%n", total);
        }
        else if (cod == 3) {
            total = quantidade * 5.00;
            System.out.printf("Total: %.2f%n", total);
        }
        else if (cod == 4) {
            total = quantidade * 2.00;
            System.out.printf("Total: %.2f%n", total);
        }
        else if (cod == 5) {
            total = quantidade * 1.50;
            System.out.printf("Total: %.2f%n", total);
        }

        sc.close();
    }
}
