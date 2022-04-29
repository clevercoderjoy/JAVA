/*
350. Intersection of Two Arrays II
Easy

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000

Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */

package LeetCode;
import java.util.*;

public class IntersectionArray2 {
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
        List<Integer> intersection = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
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
        for (int k = 0; k < intersection.size(); k++) {
            ans[k] = intersection.get(k);
        }
        return ans;
    }
}
