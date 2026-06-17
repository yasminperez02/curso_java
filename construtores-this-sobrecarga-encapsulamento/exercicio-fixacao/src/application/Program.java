package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account conta;

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Fazer depósito inicial (s/n)? ");
        char opcional = sc.next().charAt(0);


        if (opcional == 's') {
            System.out.println("Digite valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Account(numero, titular, depositoInicial);
        }
        else {
            conta = new Account(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor a ser depositado: ");
        double quantia = sc.nextDouble();
        conta.deposito(quantia);
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor a do saque: ");
        quantia = sc.nextDouble();
        conta.saque(quantia);
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        sc.close();
    }
}
