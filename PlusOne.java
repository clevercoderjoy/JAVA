/*
66. Plus One
Easy

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */

package LeetCode;
import java.util.*;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the digit array: ");
        int size = sc.nextInt();
        int[] digit = new int[size];
        takeInput(size, digit);
    }

    static void takeInput(int size, int[] digit){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for the digits array: ");
        for (int i = 0; i < size; i++) {
            digit[i] = sc.nextInt();
        }
        System.out.println("The entered array is: ");
        System.out.println(Arrays.toString(digit));
        int[] ans = plusOne(digit);
        System.out.println(Arrays.toString(ans));
    }

    static int[] plusOne(int[] digit){
        int[] ans = new int[digit.length + 1];
        for (int i = (digit.length - 1); i >= 0; i--) {
            if(digit[i] < 9){
                digit[i]++;
                return digit;
            }
            else{
                digit[i] = 0;
            }
        }
        ans[0] = 1;
        return ans;
    }
}







