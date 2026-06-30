import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa: %n", (i+1));
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double media = 0.0;
        for (int i=0; i< altura.length; i++) {
            media += altura[i] / n;
        }

        String[] nomeMenor = new String[n];
        int menor = 0;
        for (int i=0; i< idade.length; i++) {
            if (idade[i] < 16) {
                nomeMenor[menor] = nome[i];
                menor++;
            }
        }

        double porcentagem = (double) menor / n * 100;

        System.out.printf("Altura média: %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", porcentagem);

        for (int i = 0; i < menor; i++) {
            System.out.println(nomeMenor[i]);
        }

        sc.close();
    }
}
