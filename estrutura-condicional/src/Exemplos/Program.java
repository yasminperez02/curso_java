package Exemplos;

public class Program {
    public static void main(String[] args) {
        double price = 400.00;
        double discount;

        if (price < 200) {
            discount = 0;
        }
        else {
            discount = price * 0.1;
        }

        System.out.println(discount);
    }
}
