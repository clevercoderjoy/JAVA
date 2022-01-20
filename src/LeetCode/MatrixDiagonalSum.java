/*
1572. Matrix Diagonal Sum
Easy

Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:


Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
Example 3:

Input: mat = [[5]]
Output: 5

Constraints:

n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100
 */

package LeetCode;
import java.util.*;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrix: ");
        int size = sc.nextInt();
        int[][] sqMatrix = new int[size][size];
        takeInput(size, sqMatrix);
    }

    static void takeInput(int size, int[][] sqMatrix){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for the matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqMatrix[i][j] = sc.nextInt();
            }
        }
        diagonalSum(sqMatrix);
    }

    static void diagonalSum(int[][] sqMatrix){
        int sumOfDiagonals = 0;
        for (int i = 0; i < sqMatrix.length; i++) {
            sumOfDiagonals += sqMatrix[i][i] + sqMatrix[i][sqMatrix.length - 1 - i];
        }
        if(sqMatrix.length % 2 == 0)
            System.out.println(sumOfDiagonals);
        else
            System.out.println(sumOfDiagonals - sqMatrix[sqMatrix.length/2][sqMatrix.length/2]);
    }
}





















