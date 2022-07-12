package by.tms.string.less2;

import java.util.LinkedHashMap;
import java.util.Map;

public final class RomanUtil {

    private RomanUtil(){}

    private final static Map<String, Integer> mapRoman = new LinkedHashMap<>();

    static {
        mapRoman.put("M", 1000);
        mapRoman.put("CM", 900);
        mapRoman.put("DCCC", 800);
        mapRoman.put("DCC", 700);
        mapRoman.put("DC", 600);
        mapRoman.put("D", 500);
        mapRoman.put("CD", 400);
        mapRoman.put("C", 100);
        mapRoman.put("XC", 90);
        mapRoman.put("LXXX", 80);
        mapRoman.put("LXX", 70);
        mapRoman.put("LX", 60);
        mapRoman.put("L", 50);
        mapRoman.put("XL", 40);
        mapRoman.put("X", 10);
        mapRoman.put("IX", 9);
        mapRoman.put("VIII", 8);
        mapRoman.put("VII", 7);
        mapRoman.put("VI", 6);
        mapRoman.put("V", 5);
        mapRoman.put("IV", 4);
        mapRoman.put("III", 3);
        mapRoman.put("II", 2);
        mapRoman.put("I", 1);
    }


    public static int romanToArabic(String roman){
        int result = 0;
        for (Map.Entry<String, Integer> entry : mapRoman.entrySet()){
            while(roman.startsWith(entry.getKey())){
                result += entry.getValue();
                roman = roman.substring(entry.getKey().length());
                if(roman.isEmpty()){
                    return result;
                }
            }
        }
        return result;
    }


}
