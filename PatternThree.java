/*
3.  *****
    ****
    ***
    **
    *
 */

package LeetCode;
import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i + 1); j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
