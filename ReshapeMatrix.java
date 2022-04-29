/*
566. Reshape the Matrix
Easy

In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:

Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:

Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]

Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 100
-1000 <= mat[i][j] <= 1000
1 <= r, c <= 300
 */

package LeetCode;
import java.util.*;

public class ReshapeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        takeInput(m, n, mat);
    }

    static void takeInput(int m, int n, int[][] mat){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered matrix is: ");
        for(int[] row : mat){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Enter rows and columns to reshape the matrix in: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        reshape(m, n, mat, r, c);
    }

    static void reshape(int m, int n, int[][] mat, int r, int c){
        int[][] ans = new int[r][c];
        if((m * n) != (r * c)){
            System.out.println("Matrix cannot be reshaped: ");
            for(int[] row : mat){
                System.out.println(Arrays.toString(row));
            }
        }
        else{
            int row = 0;
            int col = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    ans[row][col] = mat[i][j];
                    col++;
                    if(col == c){
                        col = 0;
                        row++;
                    }
                }
            }
            System.out.println("The reshaped matrix is: ");
            for(int[] ans_row : ans){
                System.out.println(Arrays.toString(ans_row));
            }
        }
    }
}






















