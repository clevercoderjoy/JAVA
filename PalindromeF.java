import java.util.Scanner;
public class PalindromeF {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copyNum = num;
        breakNumber(copyNum, num);
        sc.close();
    }

    static void breakNumber(int copyNum, int num){
        int rev = 0;
        while(num != 0){
        int d = (num % 10);
        rev = rev * 10 + d ;
        num = num / 10;
        }
        System.out.println(checkPalindrome(copyNum, rev));
    }

    static boolean checkPalindrome(int copyNum, int rev){
        if(rev == copyNum){
            return true;
        }
        else{
            return false;
        }
    }
}
