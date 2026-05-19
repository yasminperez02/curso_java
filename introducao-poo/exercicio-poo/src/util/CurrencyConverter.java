package util;

public class CurrencyConverter {
    public static final double iof = 0.06;

    public static double dollarToReal(double dollarprice, double amount) {
        return dollarprice * amount * (1.0 + iof);
    }
}
