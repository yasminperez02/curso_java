import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maiorIdade = 0;
        int p = 0;
        for (int i = 0; i < idade.length; i++) {
            if (maiorIdade < idade[i]) {
                maiorIdade = idade[i];
                p = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[p]);

        sc.close();
    }
}
