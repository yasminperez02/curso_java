package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    void main() {
        Account acc = new Account(1001, "Ana Maria", 1000.00);
        Account acc1 = new BusinessAccount(1002, "Bob Brown", 1000.00, 200.00);
        Account acc2 = new SavingsAccount(1003, "Joana silva", 1000.00, 0.01);

        acc.withdraw(200.00);
        acc1.withdraw(200.00);
        acc2.withdraw(200.00);

        IO.println("acc: " + acc.getBalance());
        IO.println("acc1: " + acc1.getBalance());
        IO.println("acc2: " + acc2.getBalance());
    }
}
