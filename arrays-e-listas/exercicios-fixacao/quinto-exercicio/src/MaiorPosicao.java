import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        for (int i=0; i< vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double maiorValor = vetor[0];
        for (double valor : vetor) {
            if (valor > maiorValor) {
                maiorValor = (double) valor;
            }
        }

        int p = 0;
        for (int i=0; i< vetor.length; i++) {
            if (maiorValor == vetor[i]) {
                p += i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + p);


        sc.close();
    }
}
