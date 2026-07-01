import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA, vetorB, vetorC;

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        System.out.println("Digite os valores do vetor A: ");

        vetorA = new int[n];
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");

        vetorB = new int[n];
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");

        vetorC = new int[n];
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

        sc.close();
    }
}
