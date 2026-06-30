import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double maiorValor = vetor[0];
        int p = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                p = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d%n", p);

        sc.close();
    }
}
