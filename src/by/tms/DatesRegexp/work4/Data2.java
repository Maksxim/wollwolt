package by.tms.DatesRegexp.work4;

import java.time.Duration;
import java.time.LocalDate;

public class Data2 {

    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2020,06,25);
        LocalDate data1 = LocalDate.now();
        Duration duration = Duration.between(data.atStartOfDay(),data1.atStartOfDay());
        System.out.println(duration.getSeconds());
    }
}
