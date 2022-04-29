/*
81. Search in Rotated Sorted Array II
Medium

There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
You must decrease the overall operation steps as much as possible.

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
nums is guaranteed to be rotated at some pivot.
-104 <= target <= 104

SOL: https://youtu.be/W9QJ8HaRvJQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=11447
https://leetcode.com/problems/search-in-rotated-sorted-array-ii/discuss/28277/AC-answer-based-on-%22Search-in-Rotate-Sorted-Array%22-so-two-problems-%22consolidated%22-as-one
 */

package LeetCode;
import java.util.*;

public class SearchInDuplicatedRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(n, arr);
    }

    static void takeInput(int n, int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some duplicate elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println("Enter a target element to search in the array: ");
        int target = sc.nextInt();
        System.out.println(searchArray(n, arr, target));
    }

    static boolean searchArray(int n, int[] arr, int target){
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                System.out.println(mid);
                return true;
            }
            while(arr[start] == arr[mid] && start !=  mid)
                start++;
            while(arr[end] == arr[mid] && end != mid)
                end--;
            if(arr[start] <= arr[mid]){
                if(arr[start] <= target && target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            if(arr[mid] <= arr[end]){
                if(arr[mid] < target && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }
}
