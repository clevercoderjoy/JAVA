package LeetCode;
import java.util.*;

public class RotationCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(n, arr);
    }

    static void takeInput(int n, int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for rotated the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println(countRotation(arr, 0, arr.length - 1));
    }

    static int countRotation(int[] arr, int start, int end){
        if(start > end)
            return 0;
        if(start == end)
            return start;
        int mid = start + (end - start) / 2;
        if(mid < end && arr[mid + 1] < arr[mid])
            return mid + 1;
        if(mid > start && arr[mid - 1] > arr[mid])
            return mid;
        if(arr[end] > arr[mid])
            return countRotation(arr, start, mid - 1);
        else
            return countRotation(arr, mid + 1, end);
    }
}