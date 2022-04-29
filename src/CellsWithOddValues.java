/*
252. Cells with Odd Values in a Matrix
Easy

QUES: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
For each location indices[i], do both of the following:
Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

Example 1:

Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
Example 2:

Input: m = 2, n = 2, indices = [[1,1],[0,0]]
Output: 0
Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.

Constraints:

1 <= m, n <= 50
1 <= indices.length <= 100
0 <= ri < m
0 <= ci < n

SOL: https://www.youtube.com/watch?v=K_d8kSbr2mc
 */

package LeetCode;
import java.util.Scanner;
import java.util.Arrays;

public class CellsWithOddValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter the size of indices matrix: ");
        int iM = sc.nextInt();
        int[][] indices = new int[iM][2];
        takeInput(m, n, indices);
    }

    static void takeInput(int m, int n, int[][] indices){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for matrix of size " + indices.length + " x " + 2 + ": ");
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < 2; j++) {
                indices[i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered indices matrix is: ");
        for (int[] index : indices) {
            System.out.print(Arrays.toString(index));
            System.out.println();
        }
        System.out.println();
        modifyCells(m, n, indices);
    }

    static void modifyCells(int m, int n, int[][] indices){
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]] ^= true;
            col[indices[i][1]] ^= true;
        }
        int r = 0;
        int c = 0;
        for (int i = 0; i < m; i++) {
            if(row[i])
                r++;
        }
        for (int i = 0; i < n; i++) {
            if(col[i])
                c++;
        }
        System.out.println((r * n) + (c * m) - (2 * r * c));

    }
}
