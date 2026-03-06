import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, resultado;

        System.out.println("Digite um número inteiro:");
        n1 = sc.nextInt();
        System.out.println("Digite outro número inteiro:");
        n2 = sc.nextInt();
        resultado = n1 + n2;

        System.out.printf("Dados inseridos: %d, %d %n", n1, n2);
        System.out.println("soma = " + resultado);
    }
}
