package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-10-16");
        LocalDateTime d05 = LocalDateTime.parse("2025-10-16T16:00:01");
        Instant d06 = Instant.parse("2025-10-16T16:00:01Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(d04.format(fmt1));
        System.out.println(fmt1.format(d04));

        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d05.format(fmt1));
        System.out.println(d05.format(fmt2));
        System.out.println(d05.format(fmt4));

        System.out.println(fmt3.format(d06));
        System.out.println(fmt5.format(d06));
    }

}
