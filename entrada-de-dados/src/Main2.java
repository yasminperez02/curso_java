void main() {
    double x = 2.0;
    double y = 3.0;
    double z = -5.0;
    double A, B, C, delta;

    A = Math.sqrt(x);
    B = Math.sqrt(y);
    C = Math.sqrt(25);

    IO.println("DADOS INSERIDOS: ");
    IO.println("Raiz quadrada de " + x + " = " + A);
    IO.println("Raiz quadrada de " + y + " = " + B);
    IO.println("Raiz quadrada de 25 = " + C);

    A = Math.pow(x, y);
    B = Math.pow(x, 2.0);
    C = Math.pow(5.0, 2.0);

    IO.println(x + " elevado a " + y + " = " + A);
    IO.println(x + " elevado a 2 = " + B);
    IO.println("5.0 elevado a 2 = " + C);

    A = Math.abs(y);
    B = Math.abs(z);
    IO.println("valor absoluto de " + y + " é " + A);
    IO.println("valor absoluto de " + z + " é " + B);

    double x1, x2;
    double a, b, c;
    a = 2.0;
    b = 3.0;
    c = 3.0;

//    delta = Math.pow(b, 2.0) -4*a*c;
//    x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
//    x2 = (-b -Math.sqrt(delta)) / (2.0 * a);
//
//    System.out.println(x1);
//    System.out.println(x2);
}
