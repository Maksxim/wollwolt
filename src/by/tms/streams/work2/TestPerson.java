package by.tms.streams.work2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestPerson {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan","Ivanov",30);
        Person oleg = new Person("Oleg","Loginov",25);
        Person max = new Person("Max","Boiko",27);
        Person kiril = new Person("Kiril","Mikityk", 21);
        Person vadim =new Person("Vadim","Yashin",18);
        List<Person> str = new ArrayList<>();
        str = Arrays.asList(ivan, oleg, max, kiril, vadim);
        str.stream()
                .filter((x) -> (x.getFirstName().length() + x.getLastName().length()) <= 15)
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(x -> System.out.println(x.getFirstName() + " " + x.getLastName()));
    }
}
