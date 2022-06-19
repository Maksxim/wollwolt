package by.tms.lesson2;

import java.util.Arrays;

public class less3 {

    public static void main(String[] args){
        int[][] array = {{4,9,2,7,3,}, {2,3,7,5,9}, {9,4,6,0,1}};
        int[] array2;
        int t = 0;
        array2 = new int[15];
        for (int i=0; i<3;++i){
            for(int j=0; j<5; ++j){
                array2[t++] = array[i][j];
            }
        }

        System.out.println(Arrays.toString(array2));

    }
}

