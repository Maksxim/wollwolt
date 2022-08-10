package by.tms.DatesRegexp.work1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {

    public static void main(String[] args) {
        String email = "a123b456@gmail.com";
        String regexp = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        Pattern pattern = Pattern.compile(regexp);
        System.out.println(email.matches(regexp));

    }
}
