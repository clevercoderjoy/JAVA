/*
410. Split Array Largest Sum
Hard

Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.
Write an algorithm to minimize the largest sum among these m subarrays.

Example 1:

Input: nums = [7,2,5,10,8], m = 2
Output: 18
Explanation:
There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8],
where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], m = 2
Output: 9
Example 3:

Input: nums = [1,4,4], m = 3
Output: 4

Constraints:

1 <= nums.length <= 1000
0 <= nums[i] <= 106
1 <= m <= min(50, nums.length)
 */

package LeetCode;
import java.util.*;

public class SplitArrayLargestSum {
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
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println("Enter an integer to split the array into: ");
        int m = sc.nextInt();
        System.out.println(splitArray(n, arr, m));
    }

    static int splitArray(int n, int[] arr, int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
//        getting the maximum element of the array
            start = Math.max(start, arr[i]);
//            getting the sum of all the elements of the array
            end += arr[i];
        }
//        binary search
        while(start < end){
            int mid = start + (end - start) / 2;
//            calculating the number of pieces in which the array can be divided
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
//                mid => the number allowed
                if(sum + num > mid){
//                    we cannot add the element in the sub array so make a new sub array
//                    when adding element to the new sub array then the sum of that new sub array will be num
                    sum = num;
//                    increment the pieces since we are shifting to another piece
                    pieces++;
                }
                else{
//                    keep adding in the previous sum
                    sum += num;
                }
            }
            if(pieces > m)
                start = mid + 1;
            else
                end = mid;
        }
        return end;
    }
}
