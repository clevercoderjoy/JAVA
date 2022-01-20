/*
867. Transpose Matrix

Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109
 */

package LeetCode;
import java.util.*;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        takeInput(m, n, matrix);
    }

    static void takeInput(int m, int n, int[][] matrix){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of matrix for size " + m + " x " + n + " : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int[] row : matrix){
            System.out.print(Arrays.toString(row));
            System.out.println();
        }
        System.out.println();
        transpose(m, n, matrix);
    }

    static void transpose(int m, int n, int[][] matrix){
        int[][] ans = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        for(int[] row : ans){
            System.out.println(Arrays.toString(row));
        }
    }
}














