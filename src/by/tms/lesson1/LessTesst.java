//1. Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
package by.tms.lesson1;

import java.util.Scanner;

public class LessTesst {

    public static void main(String [] args) {

        Scanner value = new Scanner(System.in);
        int counter = value.nextInt();
        int veribale;
        veribale = 0;
        while (counter != 0) {
            veribale += counter % 10;
            counter /= 10;
        }
        System.out.println(veribale);
    }
    }
