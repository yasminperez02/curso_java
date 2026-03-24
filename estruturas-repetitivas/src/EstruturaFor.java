import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.println("Quantas vezes vai ser feita a soma?");
        int N = sc.nextInt();

        int soma = 0;
        for (int i=0; i<N; i++) {
            int numDigitado = sc.nextInt();
            soma += numDigitado;
        }
        System.out.println(soma);

        sc.close();
    }
}
