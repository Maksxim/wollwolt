package by.tms.streams.work1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number = List.of(1, 2, 3, 4, 5);
        String str = number.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(str);

    }
}
