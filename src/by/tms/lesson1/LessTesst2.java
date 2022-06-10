//2. Написать программу, вычисляющую и отображающую все числа Фибоначчи
// меньше введённого пользователем целого числа.
package by.tms.lesson1;

import java.util.Scanner;

public class LessTesst2 {

    public static void main(String[] args){

        Scanner veribale = new Scanner(System.in);
        int voll;
        int foll;
        int ball;
        int jofe;
        voll =veribale.nextInt();
        ball = 0;
        for(jofe = 1; jofe <= voll;foll = ball + jofe, ball = jofe, jofe = foll) {
            System.out.println(jofe);
        }

    }
}
