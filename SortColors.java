/*
75. Sort Colors
Medium

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2. */

package LeetCode;
import java.util.*;

public class SortColors {
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
        System.out.println("The entered array is: ");
        System.out.println(Arrays.toString(arr));
        sortColors(n, arr);
    }

    static void sortColors(int n, int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        while(start < end && index <= end){
            if(arr[index] == 0){
                arr[index] = arr[start];
                arr[start] = 0;
                start++;
                index++;
            }
            else if(arr[index] == 2){
                arr[index] = arr[end];
                arr[end] = 2;
                end--;
            }
            else
                index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
