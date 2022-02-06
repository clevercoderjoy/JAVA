/*
Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.

Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1

Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1

Hint: The basic idea is that the maximum value the first missing positive could be is nums.length + 1. If we find a number n such that 1 <= n <= nums.length then we should relocate that number to index n - 1. Once we've done this for each number in the array, then the first missing positive will be i + 1 for the smallest index i such that nums[i] != i + 1, or if every index has this property then the first missing positive is nums.length + 1.
 */

package LeetCode;
import java.util.*;

public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(n, arr);
    }

    static void takeInput(int n, int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arr));
        int ans = missingPositive(n, arr);
        System.out.println(ans);
    }

    static int missingPositive(int n, int[] arr){
        for (int i = 0; i < n; i++) {
            int correctPos = arr[i];
            while(1 <= correctPos && correctPos <= n && arr[correctPos - 1] != correctPos){
                int temp = arr[correctPos - 1];
                arr[correctPos - 1] = correctPos;
                correctPos = temp;
            }
        }
        for (int j = 0; j < n; j++) {
            if(arr[j] != j + 1)
                return (j + 1);
        }
        return (n + 1);
    }
}
