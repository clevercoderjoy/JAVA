/*
875. Koko Eating Bananas
Medium

Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4

Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30

Example 3:
Input: piles = [30,11,23,4,20], h = 6
Output: 23

Constraints:
1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109

SOL: https://leetcode.com/problems/koko-eating-bananas/discuss/1703687/JavaC%2B%2B-A-very-very-well-detailed-explanation
https://www.youtube.com/watch?v=oayAjb2e9gM
 */

package LeetCode;
import java.util.*;

public class EatingBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] piles = new int[n];
        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(piles));
        System.out.println("Enter time: ");
        int h = sc.nextInt();
        System.out.println(eatBananas(n, piles, h));
    }

    static int eatBananas(int n, int[] piles, int h){
        Arrays.sort(piles);
        int start = 1;
        int end = piles[n - 1];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(canEatBananas(piles, mid, h))
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }

    static boolean canEatBananas(int[] piles, int k, int h){
        int hrs = 0;
        for(int pile : piles){
            int div = pile / k;
            hrs += div;
            if(pile % k != 0)
                hrs++;
        }
        return hrs <= h;
    }
}
