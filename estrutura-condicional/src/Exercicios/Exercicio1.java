package Exercicios;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

       Scanner sc = new Scanner(System.in);
       int num;

       num = sc.nextInt();

       if(num < 0) {
           System.out.println("NEGATIVO");
       }
       else {
           System.out.println("POSITIVO");
       }

       sc.close();
    }
}
