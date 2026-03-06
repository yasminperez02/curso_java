void main() {
    double x = 2.0;
    double y = 3.0;
    double z = -5.0;
    double A, B, C;

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
}
