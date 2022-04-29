/*
59. Spiral Matrix II
Medium

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Example 1:

Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Example 2:

Input: n = 1
Output: [[1]]

Constraints:

1 <= n <= 20
 */

package LeetCode;
import java.util.*;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        printSpiral(mat);
    }

    static void printSpiral(int[][] mat){
        int top = 0;
        int bottom = (mat.length - 1);
        int left = 0;
        int right = (mat.length - 1);
        int counter = 1;
        while(left <= right && top <= bottom){
            for (int i = left; i <= right; i++) {
                mat[top][i] =counter++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = counter++;
            }
            right--;
            if(left <= right){
                for (int i = right; i >= left; i--) {
                    mat[bottom][i] = counter++;
                }
            }
            bottom--;
            if(top <= bottom){
                for (int i = bottom; i >= top; i--) {
                    mat[i][left] = counter++;
                }
            }
            left++;
        }
        for(int[] row : mat){
            System.out.println(Arrays.toString(row));
        }
    }
}
