/*
1295. Find Numbers with Even Number of Digits
Easy

Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105
 */

package LeetCode;
import java.util.*;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        takeInput(arr);
    }

    static void takeInput(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        countDigits(arr);
    }

    static void countDigits(int[] arr){
        int count = 0;
        for (int number : arr) {
            int digitCount = 0;
            while (number != 0) {
                number = number/10;
                digitCount++;
            }
            if(digitCount % 2 == 0)
                count++;
        }
        System.out.println("Numbers with Even Number of Digits: " + count);
    }
}





















