package Exercicios;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
       // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.print("PAR");
        }
        else {
            System.out.print("IMPAR");
        }

        sc.close();
    }
}