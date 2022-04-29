/*
442. Find All Duplicates in an Array
Medium

QUES: https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:
Input: nums = [1,1,2]
Output: [1]

Example 3:
Input: nums = [1]
Output: []

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.

SOL: https://youtu.be/JfinxytTYFQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=3913
 */

package LeetCode;
import java.util.*;

public class LC442_FindAllDuplicates {
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
        System.out.println(findNumbers(n, arr));
    }

    static List<Integer> findNumbers(int n, int[] arr){
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while(i < n){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex])
                swap(arr, i, correctIndex);
            else
                i++;
        }
        for (int j = 0; j < n; j++) {
            if(arr[j] != j + 1)
                ans.add(arr[j]);
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
