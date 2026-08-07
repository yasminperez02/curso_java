import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {

//        for (String s : ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }

        LocalDate d04 = LocalDate.parse("2026-07-30");
        LocalDateTime d05 = LocalDateTime.parse("2026-07-30T13:50");
        Instant d06 = Instant.parse("2026-07-30T01:30:09Z");

        LocalDate r01 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r02 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r03 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r04 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        // Obter data-hora global para local
        System.out.println("R01 = " + r01);
        System.out.println("R02 = " + r02);
        System.out.println("R03 = " + r03);
        System.out.println("R04 = " + r04);

        // Obter dados de uma data-hora local
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 hora = " + d05.getMinute());
    }
}
