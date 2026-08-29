package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        IO.println("=============================");
        IO.println("Enter client data:");
        IO.println("=============================");
        IO.print("Name: ");
        String name = sc.nextLine();
        IO.print("Email: ");
        String email = sc.next();
        IO.print("Birth date (dd/MM/yyyy): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), fmt);

        Client client = new Client(name, email, birthDate);

        IO.println("=============================");
        IO.println("Enter order data:");
        IO.println("=============================");
        IO.print("Status: ");
        String status = sc.next();
        OrderStatus os1 = OrderStatus.valueOf(status);

        Order order = new Order(LocalDateTime.now(), os1, client);

        IO.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            IO.println("Enter #" + i + " item data:");
            IO.print("Product name: ");
            String productName = sc.next();
            IO.print("Product price: ");
            double productPrice = sc.nextDouble();
            IO.print("Quantity: ");
            int quantity = sc.nextInt();

            Product produto = new Product(productName, productPrice);
            OrderItem items = new OrderItem(quantity, produto.getPrice(), produto);
            order.addItem(items);
        }

        IO.println();
        IO.println("ORDER SUMMARY: ");
        IO.println(order);
        IO.println(client);
        IO.println("ORDER ITEMS: ");

        for (OrderItem c : order.getItems()) {
            IO.println(c);
        }

        IO.println("Total price: $" + String.format("%.2f", order.total()));

        sc.close();
    }
}
