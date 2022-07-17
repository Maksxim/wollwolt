package by.tms.exception;

import java.util.Random;

public final class TaskUtil {

    private TaskUtil(){}

    public static String generateNullPointerException(String dog){
       return dog.toString();
    }

    public static void generateArrayIndexOutOfBoundsException(){
        int[] arr = new int[5];
        arr[5] = 10;
    }

    public static void generateIllegalArgumentException(){
        throw new IllegalArgumentException();
    }
    public static void generateArithmeticException(){
        throw new ArithmeticException();
    }
    public static int genRandom(int a, int b){
        Random rand = new Random();
        return a + rand.nextInt(b - a + 1);
    }
}
