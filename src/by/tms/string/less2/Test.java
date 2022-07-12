package by.tms.string.less2;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        System.out.print("Type roman number:");
        Scanner scanner = new Scanner(System.in);
        String roman = scanner.nextLine();
        int arabic = RomanUtil.romanToArabic(roman);
        System.out.print("Arabic:" + arabic);
    }

}

