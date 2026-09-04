package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        IO.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            IO.println("Employee #" + i + " data:");
            IO.print("Outsourced (y/n): ");
            char ch = sc.next().charAt(0);
            IO.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            IO.print("Hours: ");
            int hours = sc.nextInt();
            IO.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                IO.print("Additional charge: ");
                double addcharge = sc.nextDouble();

                list.add(new OutsourcedEmployee(name, hours, valuePerHour,addcharge));
            }
            else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        IO.println("Payments:");

        for (Employee emp : list) {
            IO.println(emp.getName() + " - " + emp.payment());
        }

        sc.close();
    }
}
