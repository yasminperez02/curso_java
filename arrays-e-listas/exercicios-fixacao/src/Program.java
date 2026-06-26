import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        for (int i=0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");

        double soma = 0.0;
        for (int i=0; i< numeros.length; i++) {
            System.out.printf("%.1f ", numeros[i]);
            soma += numeros[i];
        }

        double avg = soma / n;
        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + avg);

        sc.close();
    }
}
