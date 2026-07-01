import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        for (int i =0; i<vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int p = 0;
        int somaPar = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                somaPar += vetor[i];
                p++;
            }
        }
        double media = (double) somaPar / p;

        if (somaPar != 0) {
            System.out.printf("MEDIA DOS PARES = %.1f\n" ,media);
        }
        else  {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
