/*
238. Product of Array Except Self
Medium

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */

package LeetCode;
import java.util.*;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(n, arr);
    }

    static void takeInput(int n, int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array is: ");
        System.out.println(Arrays.toString(arr));
        productExceptSelf(n, arr);
    }

    static void productExceptSelf(int n, int[] arr){
        int[] ans = new int[n];
        int current = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = current;
            current *= arr[i];
        }
        current = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= current;
            current *= arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}