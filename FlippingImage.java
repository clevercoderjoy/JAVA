/*
832. Flipping an Image
Easy

Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

Constraints:

n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.
 */

package LeetCode;
import java.util.Scanner;
import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int n = sc.nextInt();
        int[][] image = new int[n][n];
        takeInput(image, n);
        sc.close();
    }

    static void takeInput(int[][] image, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for the matrix of size " + n + " x " + n +": ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] = sc.nextInt();
            }
        }
        flipImage(image);
    }

    static void flipImage(int[][] image){
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[i].length + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][image[0].length -j - 1] ^ 1;
            image[i][image[0].length - j - 1] = temp;
            }
        }
        System.out.println();
        for (int[] ints : image) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}