import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a string.");
        String s = ip.nextLine();
        int len = s.length();
        boolean isPalindrome = true;
        for(int i = 0; i < (s.length() / 2); i++){
            if(s.charAt(i) == s.charAt(len - 1)){
                len--;
            }
            else{
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The string is palindrome!");
        }
        else{
            System.out.println("The string is not palindrome!");
        }
    }
}
