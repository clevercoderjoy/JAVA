/*
989. Add to Array-Form of Integer
Easy
QUES: https://leetcode.com/problems/add-to-array-form-of-integer/

The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021

Constraints:

1 <= num.length <= 104
0 <= num[i] <= 9
num does not contain any leading zeros except for the zero itself.
1 <= k <= 104
SOL: https://www.youtube.com/watch?v=K0NDHD-xaGo&t=691s
 */

package LeetCode;
import java.util.*;

public class ArrayFormInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter a number to add to the Array-Form of number: ");
        int k = sc.nextInt();
        takeInput(size, num, k);
    }

    static void takeInput(int size, int[] num, int k){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("The array entered is: ");
        for(int value : num){
            System.out.print(value + " ");
        }
        System.out.println();
        addToArray(size, num, k);
    }

    static void addToArray(int size, int[] num, int k){
        List<Integer> ans = new ArrayList<>();
        int i = size - 1;
        while(i >= 0 || k > 0){
            if(i >= 0){
                ans.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            }
            else {
                ans.add(k % 10);
                k /= 10;
            }
            i--;
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
