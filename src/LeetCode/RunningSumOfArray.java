/*
1480. Running Sum of 1d Array
Easy

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
*/

package LeetCode;
import java.util.Scanner;
import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        takeInput(n, arr);
        sc.close();
    }

    static void takeInput(int n, int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        runningSum(n, arr);
    }

    static void runningSum(int n, int arr[]){
        int ans[] = new int[n];
        int sum = 0;
        for(int i = 0; i <n; i++){
            sum += arr[i];
            ans[i] += sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}