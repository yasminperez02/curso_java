public class Main {
    public static void main(String[] args) {
        String[] vetor = new String[] {"Maria", "Joao", "Amanda"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("---------------------------");

        for (String valor : vetor) {
            System.out.println(valor);
        }
    }
}
