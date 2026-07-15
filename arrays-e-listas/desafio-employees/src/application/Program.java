package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        Employee employee;

        Integer id = 0;
        String name = "";
        Double salary = 0.0;

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Funcionário #" + i + ":");
            System.out.print("Id: ");
            id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Salário: ");
            salary = sc.nextDouble();

            employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.print("Digite o id do funcionário que vai receber aumento: ");
        int idFun = sc.nextInt();

        Employee found = null;
        for (Employee x : list) {
            if (x.getId() == idFun) {
                found = x;
            }
        }

        if (found != null) {
            System.out.print("Digite a porcentagem: ");
            double percentage = sc.nextDouble();
            found.increaseSalary(percentage);
        }
        else {
            System.out.println("Esse id não existe");
        }

        System.out.println("Lista de funcionários:");
        for (Employee x : list) {
            System.out.println(x);
        }

        sc.close();
    }
}
