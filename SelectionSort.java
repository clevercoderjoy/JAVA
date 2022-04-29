package LeetCode;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(arr));
        selectionSort(n, arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int lastIndex = n - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
