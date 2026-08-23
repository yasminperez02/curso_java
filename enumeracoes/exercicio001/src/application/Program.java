package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Departament(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n =sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Enter contract " + i + "data:");
            System.out.print("Date (dd/MM/yyyy): ");
            LocalDate dateContract = LocalDate.parse(sc.next(), fmt);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();


            HourContract contracts = new HourContract(dateContract, valuePerHour, hours);
            worker.addContract(contracts);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/yyyy): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + String.format(": %.2f",worker.income(year, month)));
        sc.close();
    }
}
