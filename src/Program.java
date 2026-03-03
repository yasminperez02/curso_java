import java.util.Locale;
void main() {
    int y = 24;
    double x = 10.35784;
    String nome = "Maria";
    int idade = 31;
    double renda = 4000.0;

    System.out.println(y);
    IO.println(x);
    System.out.printf("%.2f\n", x);
    System.out.printf("%.4f\n", x);
    Locale.setDefault(Locale.US);
    System.out.printf("%.4f\n", x);

    System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
}