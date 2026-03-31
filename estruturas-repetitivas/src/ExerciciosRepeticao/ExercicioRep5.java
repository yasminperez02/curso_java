package ExerciciosRepeticao;
import java.util.Scanner;

public class ExercicioRep5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = sc.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);
        sc.close();
    }
}
