package by.tms.lesson2;

import java.util.Arrays;

public class less1 {

    public static void main(String[] args) {
        int[] counter = {1, 2, 3, 4, 5};
        int count = counter.length;
        int temp = counter[count - 1];
        for (int j = count - 1; j > 0; j--) {
            counter[j] = counter[j - 1];
        }
        counter[0] = temp;
        System.out.println(Arrays.toString(counter));
    }
}

