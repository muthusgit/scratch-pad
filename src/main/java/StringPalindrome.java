import java.util.Arrays;

/**
 * Created by muthu on 14/09/2017.
 */
public class StringPalindrome {

    public static void main(String args[]){
        System.out.println(isPalindrome("BOB"));
        System.out.println(isPalindrome("TEST"));
        System.out.println(isPalindromeRecursion("BOOOOB"));
        System.out.println(isPalindromeRecursion("TEST"));
    }

    private static boolean isPalindrome(String s){
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        while(l>0){
            sb.append(s.charAt(l-1));
            l--;
        }
        return sb.toString().equalsIgnoreCase(s);
    }

    private static boolean isPalindromeRecursion(String s){
        return s.length()<=1 ||
                s.charAt(0) == s.charAt(s.length()-1) &&
                        isPalindromeRecursion(s.substring(1, s.length()-1));
    }


}
