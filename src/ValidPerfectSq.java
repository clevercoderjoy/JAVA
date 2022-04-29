/*
367. Valid Perfect Square
Easy

Given a positive integer num, write a function which returns True if num is a perfect square else False.
Follow up: Do not use any built-in library function such as sqrt.

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false

Constraints:

1 <= num <= 2^31 - 1
 */
package LeetCode;
import java.util.*;

public class ValidPerfectSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a valid perfect square: ");
        int num = sc.nextInt();
        System.out.println(validPerfectSquare(num));
    }

    static boolean validPerfectSquare(int num){
        long start = 1;
        long end = num;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long sq = mid * mid;
            if(sq == num)
                return true;
            else if(sq > num)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}
