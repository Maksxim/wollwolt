package by.tms.string.less1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner scanner = new Scanner(System.in);
        String polidr = scanner.nextLine();
        polidr = polidr.toLowerCase();
        if (PalindromeUtil.isPalindrome(polidr)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
