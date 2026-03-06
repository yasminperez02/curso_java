import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, diferenca;

        IO.println("Digite 4 números abaixo:");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        diferenca = (A * B - C * D);

        IO.println("DIFERENÇA = " + diferenca);
    }
}
