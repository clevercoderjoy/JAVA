/*
54. Spiral Matrix
Medium

Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
 */

package LeetCode;

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of m and n for matrix dimensions: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        takeInput(m, n, mat);
    }

    static void takeInput(int m, int n, int[][] mat){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The entered matrix is: ");
        for(int[] row : mat){
            System.out.println(Arrays.toString(row));
        }
        printSpiral(mat);
    }

    static void printSpiral(int[][] mat){
        List<Integer> ans = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = mat.length - 1;
        int colStart = 0;
        int colEnd = mat[0].length - 1;
        while(rowStart <= rowEnd && colStart <= colEnd){
            for (int i = colStart; i <= colEnd; i++) {
                ans.add(mat[rowStart][i]);
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                ans.add(mat[i][colEnd]);
            }
            colEnd--;
            if(rowStart <= rowEnd){
                for (int i = colEnd; i >= colStart ; i--) {
                    ans.add(mat[rowEnd][i]);
                }
            }
            rowEnd--;
            if(colStart <= colEnd){
                for (int i = rowEnd; i >= rowStart; i--) {
                    ans.add(mat[i][colStart]);
                }
            }
            colStart++;
        }
        System.out.println(ans);
    }
}
