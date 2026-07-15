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

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + i + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println();
        System.out.print("Digite o id do funcionário que vai receber aumento: ");
        int idSalary = sc.nextInt();

        Integer pos = position(list, idSalary);
        if (pos == null) {
            System.out.println("Esse id não existe!");
        } else {
            System.out.print("Digite a porcentagem: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("Lista de funcionários:");
        for (Employee x : list) {
            System.out.println(x);
        }

        sc.close();
    }

     public static Integer position(List<Employee> list, int id) {
        for (int i =0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
         return null;
    }
}
