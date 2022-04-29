/*
1380. Lucky Numbers in a Matrix
Easy

Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.

SOL: https://leetcode.com/problems/lucky-numbers-in-a-matrix/discuss/955888/Java-Solution-with-explanation.
 */

package LeetCode;
import java.util.*;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        takeInput(m, n, mat);
    }

    static void takeInput(int m, int n, int[][] mat){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distinct values for the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered matrix is: ");
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        luckyNumber(mat);
    }

    static void luckyNumber(int[][] mat){
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int min = mat[i][0];
            int minIndex = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] < min){
                    min = mat[i][j];
                    minIndex = j;
                }
            }
            int max = min;
            for (int j = 0; j < mat.length; j++) {
                if(mat[j][minIndex] >= max){
                    max = mat[j][minIndex];
                }
            }
            if(min == max){
                ans.add(min);
            }
        }
        System.out.println(ans);
    }
}