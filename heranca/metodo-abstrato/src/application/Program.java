package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        IO.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            IO.println("Shape #" + i + " data: ");
            IO.print("Rectangle or circle (r/c)? ");
            char resp = sc.next().charAt(0);
            IO.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (resp == 'r') {
                IO.print("Width: ");
                Double width = sc.nextDouble();
                IO.print("Height: ");
                Double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            }
            else {
                IO.print("Radius: ");
                Double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        IO.println("SHAPE AREAS:");
        for (Shape s: list) {
            IO.println(String.format("%.2f", s.area()));
        }

        sc.close();
    }
}
