package by.tms.DatesRegexp.work2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {

    public static void main(String[] args) {
        String numbers = "Word one 0AE two 3A6EF three BCD";
        String regexp = "[0-9a-fA-F]+";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(numbers);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
