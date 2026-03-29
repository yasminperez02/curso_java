package ExerciciosRepeticao;
import java.util.Scanner;

public class ExercicioRep4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes será feito a divisão?");
        int n = sc.nextInt();

        double divisao;
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (a % b == 0) {
                divisao = a / b;
                System.out.println(divisao); // resolver resolução
            }
            else {
                System.out.println("Divisão impossível!");
            }
        }

        sc.close();
    }
}
