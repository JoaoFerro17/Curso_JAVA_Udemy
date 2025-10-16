package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao {
    public static void main(String[] args) {
        //Agora
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);

        System.out.println("------------------------------------------------------------");

        //Texto ISO 8601 -> Data-hora
        LocalDate d04 = LocalDate.parse("2025-10-16");
        LocalDateTime d05 = LocalDateTime.parse("2025-10-16T16:00:01");
        Instant d06 = Instant.parse("2025-10-16T16:00:01Z");
        Instant d07 = Instant.parse("2025-10-16T16:00:01-03:00");

        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);

        System.out.println("------------------------------------------------------------");

        //Texto formato customizado -> Data-hora
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2025", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2025 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println(d08);
        System.out.println(d09);

        System.out.println("------------------------------------------------------------");

        //dia, mês, ano, [horário] -> Data-hora local
        LocalDate d10 = LocalDate.of(2022,7,20);
        LocalDateTime d11 = LocalDateTime.of(2022,7,20,1,30);

        System.out.println(d10);
        System.out.println(d11);
    }
}
