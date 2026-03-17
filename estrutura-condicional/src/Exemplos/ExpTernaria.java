package Exemplos;

public class ExpTernaria {
    public static void main(String[] args) {
        double preco = 346.99;
        double desconto;
        desconto = (preco < 20) ? preco * 0.05 : preco * 0.1;

        System.out.printf("Desconto: R$%.2f%n", desconto);
    }
}
