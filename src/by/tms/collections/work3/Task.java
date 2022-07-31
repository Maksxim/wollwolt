package by.tms.collections.work3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task {

    public static void main(String[] args) {
        System.out.println(Task.markLength4());
    }
    public static List<String> markLength4() {
        List<String> str = new LinkedList<>();
        str.add("this");
        str.add("is");
        str.add("lots");
        str.add("of");
        str.add("fun");
        str.add("for");
        str.add("every");
        str.add("Java");
        str.add("programmer");
        for (int i = 0; i < str.size(); ++i) {
            if (str.get(i).length() == 4) {
                str.addAll(i, Collections.singleton("****"));
                i = i + 1;
            }
        }
        return str;
    }
}
