package by.tms.DatesRegexp.work3;

import java.time.LocalDate;

public class Data {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate abc = LocalDate.of(2020,06,25);
        System.out.println(now.toEpochDay() - abc.toEpochDay());
    }
}
