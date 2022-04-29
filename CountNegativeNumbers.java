/*
1351. Count Negative Numbers in a Sorted Matrix
Easy

Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.

Example 2:
Input: grid = [[3,2],[1,0]]
Output: 0

Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100

Follow up: Could you find an O(n + m) solution?

SOL: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/discuss/1579607/Java-faster-than-100-whole-matrix-binary-search-O(n)-complexity
 */
package LeetCode;
import java.util.*;

public class CountNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions m x n of a matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the values for the sorted matrix of dimensions " + m + " X " + n + " :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The given matrix is: ");
        for(int[] row : mat){
            System.out.println(Arrays.toString(row));
        }
        System.out.println(countNegativeNumbers(m, n, mat));
    }

    static int countNegativeNumbers(int m, int n, int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int ans = 0;
        int r = row - 1;
        int c = 0;
        while(r >= 0 && c < col){
            if(mat[r][c] < 0){
                r--;
                ans += col - c;
            }
            else
                c++;
        }
        return ans;
    }
}
