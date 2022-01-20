/*
1886. Determine Whether Matrix Can Be Obtained By Rotation
Easy

Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

Example 1:

Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:

Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:

Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.

Constraints:

n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.
 */

package LeetCode;
import java.util.*;

public class MatrixByRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int[][] target = new int[n][n];
        takeInput(n, mat, target);
    }

    static void takeInput(int n, int[][] mat, int[][] target){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary values for the given matrix of size " + n + " x " + n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The given matrix is: ");
        for(int[] row : mat)
            System.out.println(Arrays.toString(row));
        System.out.println("Enter binary values for the target matrix of size " + n + " x " + n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                target[i][j] = sc.nextInt();
            }
        }
        System.out.println("The target matrix is: ");
        for(int[] row : target)
            System.out.println(Arrays.toString(row));
        System.out.println(rotate(n, mat, target));
    }

    static boolean rotate(int n, int[][] mat, int[][] target){
        for (int i = 0; i < 4; i++) {
            if(check(n, mat, target))
                return true;
            rotateMatrix(n, mat);
        }
        return false;
    }

    static void rotateMatrix(int n, int[][] mat){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        int start = 0;
        int end = n - 1;
        while(start <= end){
            for (int i = 0; i < n; i++) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
            }
            start++;
            end--;
        }
    }

    static boolean check(int n, int[][] mat, int[][] target){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
}
















