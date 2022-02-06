/*
73. Set Matrix Zeroes
Medium

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
You must do it in place.

Example 1:

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 */

package LeetCode;
import java.util.*;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and cols of the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat= new int[m][n];
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
        setZeroes(m, n, mat);
    }

    static void setZeroes(int m, int n, int[][] mat){
        boolean row = false;
        boolean col = false;
        for(int i=0; i < m; i++)
        {
            if(mat[i][0] == 0)
            {
                row = true;
                break;
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(mat[0][i] == 0)
            {
                col = true;
                break;
            }
        }
        for(int i = 1; i < m; i++)
        {
            for(int j=1; j < n; j++)
            {
                if(mat[i][j] == 0)
                {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        for(int i=1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                if(mat[0][j] == 0 || mat[i][0] == 0)
                    mat[i][j] = 0;
            }
        }

        if(row)
        {
            for(int i = 0; i < m; i++)
                mat[i][0] = 0;
        }
        if(col)
        {
            for(int i = 0; i < n; i++)
                mat[0][i] = 0;
        }
        for(int[] rows : mat){
            System.out.println(Arrays.toString(rows));
        }
    }
}