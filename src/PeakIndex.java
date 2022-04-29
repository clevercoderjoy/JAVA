/*
852. Peak Index in a Mountain Array
Easy

Let's call an array arr a mountain if the following properties hold:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1

Constraints:

3 <= arr.length <= 104
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
*/

package LeetCode;
import java.util.*;

public class PeakIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value >= 3 as the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(n, arr);
    }

    static void takeInput(int n, int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for the arrays: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array entered is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(findPeakIndex(n, arr));
    }

    static int findPeakIndex(int n, int[] arr){
        int start = 0;
        int end = n - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}
