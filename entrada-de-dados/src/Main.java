import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
//        String x;
//        x = sc.next();
        int x;
        double z;
        String l;
        x = sc.nextInt();
        z = sc.nextDouble();
        l = sc.next();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(z);
        System.out.println(l);

        sc.close();
    }
}
