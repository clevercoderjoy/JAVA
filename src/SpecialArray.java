/*
1608. Special Array With X Elements Greater Than or Equal X
Easy

You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
Notice that x does not have to be an element in nums.
Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.

Example 1:
Input: nums = [3,5]
Output: 2
Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.

Example 2:
Input: nums = [0,0]
Output: -1
Explanation: No numbers fit the criteria for x.
If x = 0, there should be 0 numbers >= x, but there are 2.
If x = 1, there should be 1 number >= x, but there are 0.
If x = 2, there should be 2 numbers >= x, but there are 0.
x cannot be greater since there are only 2 numbers in nums.

Example 3:
Input: nums = [0,4,3,0,4]
Output: 3
Explanation: There are 3 values that are greater than or equal to 3.

Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 1000

SOL: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/discuss/882910/Java-Beats-100-Two-Binary-Search-methods-and-detailed-explanation
 */

package LeetCode;
import java.util.*;

public class SpecialArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println(special(n, arr));
    }

    static int special(int n, int[] arr){
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] >= n - mid){
                if(mid == 0 || arr[mid - 1] < n - mid)
                    return n - mid;
                else
                    end = mid - 1;
            }
            else
            start = mid + 1;
        }
        return -1;
    }
}
