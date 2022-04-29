/*
744. Find Smallest Letter Greater Than Target
Easy

Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Example 3:

Input: letters = ["c","f","j"], target = "d"
Output: "f"

Constraints:

2 <= letters.length <= 104
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.

SOL: https://youtu.be/W9QJ8HaRvJQ
 */

package LeetCode;
import java.util.*;

public class SmallestLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        takeInput(n, arr);
    }

    static void takeInput(int n, char[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letters for the character array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("The entered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a target letter: ");
        char target = sc.next().charAt(0);
        int ans = (smallestLetterGreaterThanTarget(n, arr, target));
        System.out.println(arr[ans]);
    }

    static int smallestLetterGreaterThanTarget(int n, char[] arr, char target){
        int start = 0;
        int end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr[start % n];
    }
}
