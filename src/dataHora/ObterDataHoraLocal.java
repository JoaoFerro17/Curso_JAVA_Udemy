package dataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ObterDataHoraLocal {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-10-16T16:00:01");

        System.out.println("D04 dia = " + d04.getDayOfMonth());
        System.out.println("D04 mês = " + d04.getMonthValue());
        System.out.println("D04 dia da semana = " + d04.getDayOfWeek());
        System.out.println("D04 ano = " + d04.getYear());

        System.out.println("D05 hora = " + d05.getHour());
        System.out.println("D05 minuto = " + d05.getMinute());

    }
}
