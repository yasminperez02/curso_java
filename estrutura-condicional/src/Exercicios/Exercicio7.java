package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite x e y respectivamente: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if(x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if(x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if(x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else if(x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        }
    }
}
