package util;

public class Calculator {
    public final double PI = 3.14159;

    public double circumference(double radius) {
        return 2.00 * PI * radius;
    }

    public double volume(double radius) {
        return 4.00 * PI * radius * radius * radius / 3.00;
    }
}
