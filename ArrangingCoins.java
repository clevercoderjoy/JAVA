/*
441. Arranging Coins
Easy
QUES: https://leetcode.com/problems/arranging-coins/

You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
Example 2:

Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.

Constraints:

1 <= n <= 231 - 1
SOL: https://www.youtube.com/watch?v=dIL-weWh8To
 */

package LeetCode;
import java.util.*;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins: ");
        int n = sc.nextInt();
        System.out.println(arrangeCoins(n));
    }

//    brute force
//    static int arrangeCoins(int n){
//        int i = 1;
//        while(n >= i){
//            n -= i;
//            i++;
//        }
//        return --i;
//    }

//    binary search approach
    static int arrangeCoins(int n){
        long start = 0;
        long end = n;
        while(start <= end){
            long mid = start + (end - start) / 2;
            if((mid * (mid + 1) / 2) == n)
                return (int)mid;
            else if((mid * (mid + 1) / 2) > n)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return (int)end;
    }
}






















