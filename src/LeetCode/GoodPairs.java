/*
1512. Number of Good Pairs
Easy

Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

package LeetCode;
import java.util.Scanner;
import java.util.Arrays;

public class GoodPairs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        takeInput(size, arr);
        sc.close();
    }

    static void takeInput(int size, int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        goodPairs(arr);
    }

    static void goodPairs(int arr[]){
        if(arr.length == 0){
            System.out.println(0);
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j <arr.length; j++){
                if(arr[i] == arr[j] && i < j){
                    System.out.println("( " + i + " " + j + " )");
                }
            }
        }
    }
}
