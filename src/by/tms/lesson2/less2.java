package by.tms.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class less2 {

    public static void main(String[] args) {
        int[] array = {25, 7, 3, 8, 14, 5, 4};
        int[] resultArray = new int[array.length];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elemets to delete from array" + Arrays.toString(array) + ":");
        String lineOfElementsToDelete = input.nextLine();
        String[] elementsToDelete = lineOfElementsToDelete.split(" ");
        System.out.println("Entered elements to delete:" + Arrays.toString(elementsToDelete));

        int resultArrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            boolean found = findElementlnArray(elementsToDelete, array[i]);
            if (!found) {
                resultArray[resultArrayIndex] = array[i];
                resultArrayIndex++;
            }
        }
        resultArray = Arrays.copyOf(resultArray, resultArrayIndex);
        System.out.println("Result" + Arrays.toString(resultArray));
    }
    static boolean findElementlnArray(String[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(Integer.parseInt(arr[i]) == element) {
                return true;
            }
        }
        return false;
    }

}
