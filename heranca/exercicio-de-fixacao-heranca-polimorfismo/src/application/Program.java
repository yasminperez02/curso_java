package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        IO.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            IO.println("Tax payer #" + i + " data:");
            IO.print("Individual or company (i/c)? ");
            char resp = sc.next().charAt(0);
            IO.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            IO.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (resp == 'i') {
                IO.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
            } else {
                IO.print("Employees: ");
                int employees = sc.nextInt();
                list.add(new PessoaJuridica(name, anualIncome, employees));
            }

        }

        IO.println();
        IO.println("TAXES PAID: ");
        double sum = 0.0;
        for (Pessoa p : list) {
            double tax = p.calcularImposto();
            IO.println(p.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        IO.println();
        IO.println("TOTAL TAXES:");
        IO.println("$ " + String.format("%.2f", sum));

        sc.close();
    }
}
