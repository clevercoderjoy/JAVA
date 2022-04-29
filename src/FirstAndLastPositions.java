/*
34. Find First and Last Position of Element in Sorted Array
time complexity => O(log n).
Medium

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.


Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109

SOL: https://youtu.be/W9QJ8HaRvJQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=3733
https://www.youtube.com/watch?v=bU-q1OJ0KWw
https://www.youtube.com/watch?v=_GooGh_w2CA&t=1312s
 */

package LeetCode;
import java.util.*;

public class FirstAndLastPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(n, arr);
    }

    static void takeInput(int n, int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a target number to find in the array: ");
        int target = sc.nextInt();
        findPositions(arr, target);
    }

    static void findPositions(int[] arr, int target){
        int[] ans = {-1, -1};
        ans[0] = findFirstAndLastPosition(arr, target, true);
        if(ans[0] != -1)
            ans[1] = findFirstAndLastPosition(arr, target, false);
        System.out.println(Arrays.toString(ans));
    }

    static int findFirstAndLastPosition(int[] arr, int target, boolean findFirstPosition){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
             int mid = (start + end) / 2;
             if(arr[mid] < target){
                 start = mid + 1;
             }
             else if(arr[mid] > target){
                 end = mid - 1;
             }
             else{
                 ans = mid;
                 if(findFirstPosition)
                     end = mid - 1;
                 else
                     start = mid + 1;
             }
        }
        return ans;
    }
}
