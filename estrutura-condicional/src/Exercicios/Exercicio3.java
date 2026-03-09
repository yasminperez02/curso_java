package Exercicios;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B;

        IO.println("Digite um número inteiro de A: ");
        A = sc.nextInt();
        IO.println("Digite um número inteiro de B: ");
        B = sc.nextInt();

        if(A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
