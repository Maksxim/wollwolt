package by.tms.string.less1;

public final class PalindromeUtil {

    private PalindromeUtil(){};

    public static boolean isPalindrome(String varibale) {
        int i = varibale.length() - 1;
        int j = 0;
        while (i > j){
            if(varibale.charAt(i) != varibale.charAt(j)){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    }
