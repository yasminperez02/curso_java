import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    int cod, cod2, peca1, peca2;
    double valor1, valor2, total;

    IO.println("Digite o código da peça: ");
    cod = sc.nextInt();
    IO.println("Digite quantas unidades: ");
    peca1 = sc.nextInt();
    IO.println("Digite o valor do produto: ");
    valor1 = sc.nextDouble();
    IO.println("Digite o código da peça: ");
    cod2 = sc.nextInt();
    IO.println("Digite quantas unidades: ");
    peca2 = sc.nextInt();
    IO.print("Digite o valor do produto: ");
    valor2 = sc.nextDouble();

    total = (peca1 * valor1) + (peca2 * valor2);
    System.out.printf("Valor a pagar: R$ %.2f", total);

    sc.close();
}