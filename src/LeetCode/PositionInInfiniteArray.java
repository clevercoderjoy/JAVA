package LeetCode;
import java.util.*;

public class PositionInInfiniteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
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
        System.out.println("Entered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a target element to find in the array: ");
        int target = sc.nextInt();
        int ans = findRange(arr, target);
        System.out.println(ans);
    }

    static int findRange(int[] arr, int target){
//        starting from a box of size: 2
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
            System.out.println("Start: " + start);
            System.out.println("End: " + end);
        }
        return (findPosition(arr, target, start, end));
    }

    static int findPosition(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
//2 3 5 6 7 8 10 11 12 15 20 23 30 35
//3 5 7 9 10 90 100 130 140 160 170