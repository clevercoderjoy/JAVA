/*
Find n-th term of series 1, 3, 6, 10, 15, 21
School Accuracy: 75.99% Submissions: 6161 Points: 0
Given a number N, find the Nth term in the series 1, 3, 6, 10, 15, 21…

Example 1:
Input :
N = 4
Output:
10
Explanation:
The 4th term of the Series is 10.

Example 2:
Input :
N = 3
Output:
6
Explanation:
The 3rd term of the Series is 6.

Your Task:
You don't need to read input or print anything. Your task is to complete the function findNthTerm() which takes an Integer N as input and returns the answer.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 104
 */

package LeetCode;
import java.util.*;

public class NthTermOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int value = 1;
        int counter = 2;
        for (int i = 0; i < n - 1; i++) {
            value += counter;
            counter++;
        }
        System.out.println(value);
    }
}
