/*
Ceiling => The smallest number in an array greater than or equal to the target number
arr = [2, 3, 5, 9, 14, 16, 18]
Ceiling(arr, target = 14) => 14
Ceiling(arr, target = 15) => 16
Ceiling(arr, target = 9) => 9
Ceiling(arr, target = 4) => 5
=> when while loop breaks (start <= end), start will be equal to (end + 1). When no ans is found then we return arr[start].

SOL:
*/

package LeetCode;
import java.util.*;

public class Ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(n, arr);
    }

    static void takeInput(int n, int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a target value: ");
        int target = sc.nextInt();
        int ans = getCeiling(n, arr, target);
        System.out.println(ans);
    }

    static int getCeiling(int n, int[] arr, int target){
        if(target > arr[n - 1])
            return -1;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if( arr[mid] > target)
                end = mid - 1;
            else if(arr[mid] < target)
                start = mid + 1;
            else if(arr[mid] == target)
                return arr[mid];
        }
        return arr[start];
    }
}