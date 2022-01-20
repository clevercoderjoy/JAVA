/*
53. Maximum Subarray
Easy

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
 */

package LeetCode;

import java.util.*;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        takeInput(size, arr);
    }

    static void takeInput(int size, int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array is: ");
        System.out.println(Arrays.toString(arr));
        maximumSubArray(size, arr);
    }

    static void maximumSubArray(int size, int[] arr){
        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            sum += arr[i];
            if(sum > max){
                max = sum;
                System.out.println("MAX: " + max);
            }

            if(sum < 0){
                sum = 0;
                System.out.println("SUM: " + sum);
            }
        }
        System.out.println(max);
    }
}























