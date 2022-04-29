/*
1250. Check If It Is a Good Array
Hard
Given an array nums of positive integers. Your task is to select some subset of nums, multiply each element by an integer and add all these numbers. The array is said to be good if you can obtain a sum of 1 from the array by any possible subset and multiplicand.
Return True if the array is good otherwise return False.

Example 1:

Input: nums = [12,5,7,23]
Output: true
Explanation: Pick numbers 5 and 7.
5*3 + 7*(-2) = 1
Example 2:

Input: nums = [29,6,10]
Output: true
Explanation: Pick numbers 29, 6 and 10.
29*1 + 6*(-3) + 10*(-1) = 1
Example 3:

Input: nums = [3,6]
Output: false

Constraints:

1 <= nums.length <= 10^5
1 <= nums[i] <= 10^9
 */

package LeetCode;
import java.util.*;

public class GoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(n, arr);
    }

    static void takeInput(int n, int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array is: ");
        System.out.println(Arrays.toString(arr));
        boolean ans = goodArray(n, arr);
        System.out.println(ans);
    }

    static boolean goodArray(int n, int[] arr){
        int gcd = arr[0];
        for (int i = 0; i < n; i++) {
            gcd = gcd(gcd, arr[i]);
            if(gcd == 1)
                return true;
        }
        return gcd == 1;
    }

    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}
