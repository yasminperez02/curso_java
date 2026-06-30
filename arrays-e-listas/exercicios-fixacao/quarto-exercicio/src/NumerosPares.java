import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, quantidade;
        int[] vetor;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        vetor = new int[n];
        for (int i=0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");

        quantidade = 0;
        for (int i=0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d ", vetor[i]);
                quantidade++;
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + quantidade);

        sc.close();
    }
}
