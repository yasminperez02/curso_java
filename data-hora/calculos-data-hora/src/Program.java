import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-07-30");
        LocalDateTime d05 = LocalDateTime.parse("2026-07-30T13:50");
        Instant d06 = Instant.parse("2026-07-30T01:30:09Z");

        // Cálculo data-hora +/-
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // Data-hora 1, Data-hora 2 -> duração

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, nextWeekLocalDateTime);
        Duration t3 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t4 = Duration.between(pastWeekInstant, d06);
        Duration t5 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 = " + t1.toDays());
        System.out.println("t2 = " + t2.toDays());
        System.out.println("t3 = " + t3.toDays());
        System.out.println("t4 = " + t4.toDays());
        System.out.println("t5 = " + t5.toDays());
    }
}
