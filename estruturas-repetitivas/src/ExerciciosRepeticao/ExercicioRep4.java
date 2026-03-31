package ExerciciosRepeticao;
import java.util.Scanner;

public class ExercicioRep4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes será feito a divisão?");
        int n = sc.nextInt();

        double divisao;
        for (int i = 0; i < n; i++) {
            double num = sc.nextDouble();
            double denominador = sc.nextDouble();

            if (denominador == 0) {
                System.out.println("Divisão impossivel");
            }
            else {
                divisao = num / denominador;
                System.out.println(divisao);
            }
        }

        sc.close();
    }
}
