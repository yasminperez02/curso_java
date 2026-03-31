import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;
        do {
            System.out.println("Qual a temperatura em celcius: ");
            double C = sc.nextDouble();
            double F = C * 9 / 5 + 32;
            System.out.printf("A temperatura em fahrenheit: %.1f°F%n", F);
            System.out.println("Deseja continuar (s/n)? ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

        sc.close();
    }
}
