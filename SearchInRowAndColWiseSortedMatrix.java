package LeetCode;
import java.util.*;

public class SearchInRowAndColWiseSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row and column of the matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        takeInput(r, c, mat);
    }

    static void takeInput(int r, int c, int[][] mat){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for the matrix of size " + r + " X " + c + " : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The given matrix is: ");
        for(int[] row : mat){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Enter an element to search in the matrix: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(searchMatrix(mat, target)));
    }

    static int[] searchMatrix(int[][] mat, int target){
        int row = 0;
        int col = mat[0].length - 1;
        while(row < mat.length && col >= 0){
            if(mat[row][col] == target)
                return new int[] {row, col};
            else if(mat[row][col] > target)
                col--;
            else if(mat[row][col] < target)
                row++;
        }
        return new int[] {-1, -1};
    }
}
