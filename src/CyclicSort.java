package LeetCode;
import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(arr));
        sort(n, arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int n, int[] arr){
        int i = 0;
        while(i < n){
            int correctIndex = arr[i];
            if(arr[i] != arr[correctIndex])
                swap(arr, i, correctIndex);
            else
                i++;
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
