package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        IO.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            IO.println("Product #" + i + " data:");
            IO.print("Common, used or imported (c, u, i)? ");
            char resp = sc.next().charAt(0);
            IO.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            IO.print("Price: ");
            Double price = sc.nextDouble();
            if (resp == 'u') {
                IO.print("Manufacture date (dd/MM/yyyy): ");
                LocalDate date = LocalDate.parse(sc.next(), fmt);
                list.add(new UsedProduct(name, price, date));
            } else if (resp == 'i') {
                IO.print("Custom fee: ");
                Double customfee = sc.nextDouble();
                price += customfee;
                list.add(new ImportedProduct(name, price, customfee));
            } else {
                list.add(new Product(name, price));
            }
        }

        IO.println();
        IO.println("PRICE TAGS:");
        for (Product c : list) {
            IO.println(c.priceTag());
        }

        sc.close();
    }
}
