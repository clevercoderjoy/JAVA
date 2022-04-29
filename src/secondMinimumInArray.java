package LeetCode;
import java.util.*;

public class secondMinimumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println(findMin(n, arr));
    }

    static int findMin(int n, int[] arr){
        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < sSmallest){
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }
}
