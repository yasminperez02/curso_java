import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        sc.nextLine();
        double media;

        String[] alunos = new String[n];
        double[] semestre1 = new double[n];
        double[] semestre2 = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", (i+1));
            alunos[i] = sc.nextLine();
            semestre1[i] = sc.nextDouble();
            semestre2[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Alunos Aprovados: ");

        for (int i = 0; i < n; i++) {
            media = (semestre1[i] + semestre2[i]) / 2;

            if (media >= 6.0) {
                System.out.println(alunos[i]);
            }
        }


        sc.close();
    }
}
