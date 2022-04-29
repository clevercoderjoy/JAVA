/*
1389. Create Target Array in the Given Order
Easy

Given two arrays of integers nums and index. Your task is to create target array under the following rules:
Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.
It is guaranteed that the insertion operations will be valid.

Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
Example 3:

Input: nums = [1], index = [0]
Output: [1]

Constraints:

1 <= nums.length, index.length <= 100
nums.length == index.length
0 <= nums[i] <= 100
0 <= index[i] <= i
*/

package LeetCode;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class TargetArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        int index[] = new int[size];
        takeInput(nums, index, size);
        sc.close();
    }

    static void takeInput(int nums[], int index[], int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for the array: ");
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++){
            index[i] = sc.nextInt();
        };
        sc.close();
        targetArray(index, nums);
    }

    static void targetArray(int index[], int nums[]){
        ArrayList <Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            arr.add(index[i], nums[i]);
        }
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}