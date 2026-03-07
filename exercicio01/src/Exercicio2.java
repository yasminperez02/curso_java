import java.util.Scanner;
import java.util.Locale;

void main() {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double pi = 3.14159;
    double raio, area;

    IO.println("Digite o número abaixo:");
    raio = sc.nextDouble();

    area = pi * Math.pow(raio, 2.0);
    System.out.printf("A = %.4f", area);

    sc.close();
}