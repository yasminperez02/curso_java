package ExerciciosRepeticao;
import java.util.Scanner;

public class ExercicioRep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =3;
        double media;
        for(int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            media = (a*2 + b*3 + c*5) / 10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
