/*
645. Set Mismatch
Easy

QUES: https://leetcode.com/problems/set-mismatch/description/

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]

Constraints:
2 <= nums.length <= 104
1 <= nums[i] <= 104

SOL: https://youtu.be/JfinxytTYFQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=4308
 */

package LeetCode;
import java.util.*;

public class LC645_SetMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the size of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println(Arrays.toString(findMismatchedSet(n, arr)));
    }

    static int[] findMismatchedSet(int n, int[] arr){
        int i = 0;
        int[] ans = new int[2];
        while(i < n){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex])
                swap(arr, i, correctIndex);
            else
                i++;
        }
        for (int j = 0; j < n; j++) {
            if(arr[j] != j + 1){
                ans[0] = j + 1;
                ans[1] = arr[j];
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
