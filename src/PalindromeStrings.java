package LeetCode;
import java.util.*;

public class PalindromeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not: ");
        String s = sc.nextLine();
        System.out.println(checkPalindrome(s));
    }

    static boolean checkPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);
            if(start != end)
                return false;
        }
        return true;
    }
}
