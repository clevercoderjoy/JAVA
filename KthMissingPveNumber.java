/*
1539. Kth Missing Positive Number
Easy

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Find the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length

SOL: https://www.youtube.com/watch?v=88k8xa-pSrM
 */
package LeetCode;
import java.util.*;

public class KthMissingPveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(n, arr);
    }

    static void takeInput(int n, int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println("Enter the kth number to find in the array: ");
        int k = sc.nextInt();
        System.out.println(findElement(n, arr, k));
    }

    static int findElement(int n, int[] arr, int k){
        int start = 0;
        int end = n - 1;
//        checking if the missing elements are inside or outside the array
        while(start <= end){
            int mid = start + (end - start) / 2;
            int missing = compute(arr[mid], mid + 1);
            if(missing >= k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        if(end == -1)
            return k;
        else
            return arr[end] + k - compute(arr[end], end - 1);
    }

    static int compute(int actual, int expected){
        return actual - expected;
    }
}
