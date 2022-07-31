package by.tms.collections.work1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordsTest {

    public static void main(String[] args) {

        String str = "Near the seaside there is a green oak;\n" +
                "Golden chain on an oak tree:\n" +
                "And day and night the cat is a scientist\n" +
                "Everything goes round and round in a chain;\n" +
                "Goes to the right - the song starts,\n" +
                "To the left - he tells a fairy tale.";
        Map<String, Integer> map = new HashMap<>();
        str = str.replace("\n", " ");
        str = str.replace(";", "");
        str = str.replace(":", "");
        str = str.replace("- ", "");
        str = str.replace(",", "");
        str = str.replace(".", "");
        String[] words = str.split(" ");
        for(String word: words){
            Integer count = map.get(word);
            if(count == null){
                map.put(word, 1);
            }else{
                map.put(word, count + 1);
            }
        }
        System.out.println(map);
    }
}
