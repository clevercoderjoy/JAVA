/*
349. Intersection of Two Arrays
Easy
QUES: https://leetcode.com/problems/intersection-of-two-arrays/description/

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000

SOL: https://classroom.codingninjas.com/app/classroom/me/6559/content/83968/offering/923763/problem/27
https://leetcode.com/problems/intersection-of-two-arrays/discuss/1588036/Java-or-Three-approaches
 */
package LeetCode;
import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int m = sc.nextInt();
        System.out.println("Enter the size of second array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements for the first array: ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements for the second array: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("The given arrays are: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(findIntersection(m, n, arr1, arr2)));
    }

    static int[] findIntersection(int m, int n, int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Set<Integer> intersection = new HashSet<>();
        while(i < m && j < n){
            if(arr1[i] == arr2[j]){
                intersection.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j])
                i++;
            else
                j++;
        }
        int[] ans = new int[intersection.size()];
        int k = 0;
        for(int num : intersection){
            ans[k] = num;
            k++;
        }
        return ans;
    }
}
