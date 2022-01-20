package LeetCode;/*
1. Two Sum
Easy

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */

import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        takeInput(size, nums);
    }

    static void takeInput(int size, int[] nums){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The entered array is: " + Arrays.toString(nums));
        System.out.println("Enter a target value: ");
        int target = sc.nextInt();
        twoSum(size, nums, target);
    }

    static void twoSum(int size, int[] nums, int target){
        int[] ans = new int[2];
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}





















