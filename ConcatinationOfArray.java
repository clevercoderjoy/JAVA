/*
1929. Concatenation of Array
Easy

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]

Constraints:

n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
*/

package LeetCode;
import java.util.Scanner;
import java.util.Arrays;

public class ConcatinationOfArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[2 * n];
        ans = concatinateArray(n, arr);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }

    static int[] concatinateArray(int n, int arr[]){
        int ans[] = new int[n * 2];
        for(int i = 0; i < n; i++){
            ans[i] = arr[i];
            ans[i + n] = arr[i];
        }
        return ans;
    }
}
