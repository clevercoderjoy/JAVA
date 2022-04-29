/*
Floor: Greatest number that is smaller than equal to the target number.
arr = [2, 3, 5, 9, 14, 16, 18]
Floor(arr, target = 15) => 14
=> when while loop breaks (start <= end), start will be equal to (end + 1). When no ans is found then we return arr[end].
end becomes smaller than start.
*/

package LeetCode;
import java.util.*;

public class Floor {
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
        int ans = getFloor(n, arr, target);
        System.out.println(ans);
    }

    static int getFloor(int n, int[] arr, int target){
        if(target < arr[0])
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
        return arr[end];
    }
}
