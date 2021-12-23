import java.util.Arrays;
import java.util.Scanner;
public class SwapArray{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter value " + (i + 1) + " for the array:");
            arr[i] = sc.nextInt();
        }
        sc.close();
        reverse(arr);
        // for(int value : arr){
        //     System.out.print(value + " ");
        // }
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}