package LeetCode;
import java.util.*;

public class BinarySearchRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values for the sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println("Enter a target element to search in the array: ");
        int target = sc.nextInt();
        int start = 0;
        int end = n - 1;
        int ans = findElement(n, arr, target, start, end);
        System.out.println(ans);
    }

    static int findElement(int n, int[] arr, int target, int start, int end) {
        if(start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == target)
            return mid + 1;
        if(arr[mid] > target)
            return findElement(n, arr, target, start, mid - 1);
        return findElement(n, arr, target, mid + 1, end);
    }
}
