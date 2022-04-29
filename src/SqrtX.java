/*
69. Sqrt(x)
Easy

Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

Constraints:

0 <= x <= 231 - 1
 */
package LeetCode;
import java.util.*;

public class SqrtX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's square root: ");
        int n = sc.nextInt();
        System.out.println(getSquareRoot(n));
    }

    static int getSquareRoot(int n){
        long start = 1;
        long end = n;
        long ans = -1;
        if(n == 0)
            return 0;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long sqrt = mid * mid;
            if(sqrt == n)
                return (int)mid;
            else if(sqrt < n){
                ans = mid;
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return (int)ans;
    }
}
