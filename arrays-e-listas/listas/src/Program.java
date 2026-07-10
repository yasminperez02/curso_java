import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        //Cria lista
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Anna");
        list.add(2, "Marco");

        //Tamanho da lista
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }

        //Remove se tiver um elemento com "M"
        System.out.println("-----------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        //Encontra o index do elemento
        System.out.println("-----------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        // Cria nova lista adicionando elemento que contém "A"
        System.out.println("-----------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        //Encontra primeiro elemento da lista que comece com "A"
        System.out.println("-----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
