/*
33. Search in Rotated Sorted Array
Medium

There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104

SOL: https://youtu.be/W9QJ8HaRvJQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=10413
 */

package LeetCode;
import java.util.*;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
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
        System.out.println("Enter a target element to search in the array: ");
        int target = sc.nextInt();
//        int pivot = findPivot(n, arr, target);
//        int found = -1;
//        found = binarySearch(arr, 0, pivot, target);
//        if(found == -1)
//            found = binarySearch(arr, (pivot + 1), (n - 1), target);
//        System.out.println(found);
        System.out.println(findElement(n, arr, target));
    }

//    static int findPivot(int n, int[] arr, int target){
//        int start = 0;
//        int end = n - 1;
//        while(start <= end){
//            int mid = start + (end - start) / 2;
////            mid index should always be less than end index.
////            it can give an index out of bound error if mid is the last element of the array.
////            if the mid element is greater than the very next element (mid + 1) then it is the largest element we are looking for
//            if(mid < end && arr[mid] > arr[mid + 1])
//                return mid;
////            mid index should always be greater than start index.
////            it can give an index out of bound error if mid is the first element of the array.
////            if the mid element is smaller than the just previous element (mid - 1) then (mid - 1) it is the largest element we are looking for
//            if(mid > start && arr[mid] < arr[mid - 1])
//                return mid - 1;
////            in this case all the elements after middle will be smaller than the middle element
////            we ignore all the element from middle to end
//            if(arr[mid] <= arr[start])
//                end = mid - 1;
//            else if(arr[mid] >= arr[start])
//                start = mid + 1;
//        }
//        return -1;
//    }

//    static int binarySearch(int[] arr, int start, int end, int target){
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//            if(arr[mid] == target)
//                return mid;
//            else if(arr[mid] < target)
//                start = mid + 1;
//            else
//                end = mid - 1;
//        }
//        return -1;
//    }

    static int findElement(int n, int[] arr, int target){
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return mid;
            if(arr[start] <= arr[mid]){
                if(arr[start] <= target && target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else{
                if(arr[mid] < target && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}