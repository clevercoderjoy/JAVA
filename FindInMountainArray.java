/*
1095. Find in Mountain Array
Hard

(This problem is an interactive problem.)

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.

Constraints:

3 <= mountain_arr.length() <= 104
0 <= target <= 109
0 <= mountain_arr.get(index) <= 109
 */
package LeetCode;
import java.util.*;

public class FindInMountainArray {
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
        System.out.println("The given array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a target element: ");
        int target = sc.nextInt();
        System.out.println(mountainArray(n, arr, target));
    }

    static int mountainArray(int n, int[] arr, int target){
        int start = 0;
        int end = n - 1;
        int found = -1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        found = binarySearch(arr, target, 0, start);
        if(found == -1)
            found = binarySearch(arr, target, start + 1, n - 1);
        return found;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[0] < arr[arr.length - 1];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return mid;
            if(isAsc){
                if(arr[mid] > target)
                    end = mid - 1;
                else if(arr[mid] < target)
                    start = mid + 1;
            }
            else{
                if(arr[mid] > target)
                    start = mid + 1;
                else if(arr[mid] < target)
                    end = mid - 1;
            }
        }
        return -1;
    }
}
