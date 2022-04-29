/*
888. Fair Candy Swap
Easy

QUES: https://leetcode.com/problems/fair-candy-swap/

Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.
Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.
Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

Example 1:
Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]

Example 2:
Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]

Example 3:
Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]

Constraints:
1 <= aliceSizes.length, bobSizes.length <= 104
1 <= aliceSizes[i], bobSizes[j] <= 105
Alice and Bob have a different total number of candies.
There will be at least one valid answer for the given input.

SOL: https://leetcode.com/problems/fair-candy-swap/discuss/259366/java-solution-using-binary-search-with-explanation
https://leetcode.com/problems/fair-candy-swap/discuss/687223/java-Solution-Hash-set-with-explanantion
 */

package LeetCode;
import java.util.*;

public class CandySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the two arrays: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        System.out.println("Enter the values for the first array: ");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the values for the second array: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("The given arrays are: ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(swapCandies(m, n, a, b)));
    }

    static int[] swapCandies(int m, int n, int[] a, int[] b){
        int sumA = 0;
        int sumB = 0;
        int[] ans = new int[2];
        Arrays.sort(a);
        Arrays.sort(b);
        for(int candy : a){
            sumA += candy;
        }
        for(int candy : b){
            sumB += candy;
        }
        int diff = (sumA - sumB) / 2;
        for (int i = 0; i < a.length; i++) {
            int start = 0;
            int end = b.length - 1;
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(b[mid] == a[i] - diff){
                    ans[0] = a[i];
                    ans[1] = b[mid];
                    return ans;
                }
                else if(b[mid] < a[i] - diff)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return ans;
    }
}