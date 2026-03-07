import java.util.Scanner;
import  java.util.Locale;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int numFuncionario, horasTrabalhadas;
        double salario, valorHora;

        IO.println("Digite número do funcionario:");
        numFuncionario = sc.nextInt();
        IO.println("Digite as horas trabalhadas:");
        horasTrabalhadas = sc.nextInt();
        IO.println("Digite o valor ganho por hora trabalhada:");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;
        System.out.printf("Number: %d %nSalary: U$ %.2f", numFuncionario, salario);

        sc.close();
    }
}
