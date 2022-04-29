/*
1431. Kids With the Greatest Number of Candies
Easy
QUES: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false] 
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]

Constraints:

n == candies.length
2 <= n <= 100
1 <= candies[i] <= 100
1 <= extraCandies <= 50

SOL: https://www.youtube.com/watch?v=xnwoEISwhrY
*/

package LeetCode;
import java.util.Scanner;
import java.util.Arrays;

public class Candies {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kids: ");
        int kids = sc.nextInt();
        System.out.println("Enter the number of extra candies: ");
        int extraCandies = sc.nextInt();
        int candies[] = new int[kids];
        takeInput(kids, candies, extraCandies);
        sc.close();
    }

    static void takeInput(int kids, int candies[], int extraCandies){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of candies each kid has: ");
        for(int i = 0; i < candies.length; i++){
            candies[i] = sc.nextInt();
        }
        boolean candyArray [] = new boolean[candies.length];
        candyArray = greatestCandies(kids, candies, extraCandies);
        System.out.println(Arrays.toString(candyArray));
        sc.close();
    }

    static boolean[] greatestCandies(int kids, int candies[], int extraCandies){
        boolean ans[] = new boolean[candies.length];
        int maxCandies = -1;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            int newCandies = candies[i] + extraCandies;
            if(newCandies >= maxCandies){
                ans[i] = true;
            }
            else{
                ans[i] = false;
            }
        }
        return ans;
    }
}
