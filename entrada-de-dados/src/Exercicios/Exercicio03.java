package Exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combustivel = sc.nextInt();

        int clienteAlcool = 0;
        int clienteGasolina = 0;
        int clienteDiesel = 0;

        while(combustivel != 4) {
            if(combustivel == 1) {
                clienteAlcool += combustivel;
            }
            else if(combustivel == 2) {
                clienteGasolina += combustivel -1;
            }
            else if(combustivel == 3) {
                clienteDiesel += combustivel -2;
            }
            else {
                System.out.print("Inválido!");
            }

            combustivel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.printf("Alcool: %d%n", clienteAlcool);
        System.out.printf("Gasolina: %d%n", clienteGasolina);
        System.out.printf("Diesel: %d%n", clienteDiesel);

        sc.close();
    }
}
