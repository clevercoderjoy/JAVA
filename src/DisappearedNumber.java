/*
448. Find All Numbers Disappeared in an Array
Easy
QUES: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

SOL:
 */

package LeetCode;
import java.util.*;

public class DisappearedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
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
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else
                i++;
        }
        for (int j = 0; j < n; j++) {
            if(arr[j] != j + 1){
                ans.add(j + 1);
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
