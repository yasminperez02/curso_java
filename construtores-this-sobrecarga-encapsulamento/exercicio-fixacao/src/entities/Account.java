package entities;

public class Account {
    private int numero;
    private String titular;
    private double saldo;

    // Construtor
    public Account() {
    }

    public Account(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Account(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    // Getters e Setters

    public int getNumero() {
        return numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos
    public void deposito(double quantia) {
        this.saldo+= quantia;
    }

    public void saque(double quantia) {
        this.saldo-= quantia + 5;
    }

    public String toString() {
        return "Dados da conta: " +
                getNumero() +
                ", titular:  " +
                getTitular() +
                ", saldo: R$ " + String.format("%.2f", getSaldo());
    }
}
