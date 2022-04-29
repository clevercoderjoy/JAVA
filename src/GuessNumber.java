/*
374. Guess Number Higher or Lower
Easy

We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked.
Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
You call a pre-defined API int guess(int num), which returns three possible results:
-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.

Example 1:

Input: n = 10, pick = 6
Output: 6
Example 2:

Input: n = 1, pick = 1
Output: 1
Example 3:

Input: n = 2, pick = 1
Output: 1

Constraints:

1 <= n <= 231 - 1
1 <= pick <= n
 */
package LeetCode;
import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter a number to pick: ");
        int pick = sc.nextInt();
        System.out.println(guessNumber(n, pick));
    }

    static int guessNumber(int n, int pick){
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int guess = start + (end - start) / 2;
            if(guessApi(guess, pick) == 0)
                return guess;
            else if(guessApi(guess, pick) == 1){
                start = guess + 1;
            }
            else if(guess > pick){
                end = guess - 1;
            }
        }
        return n;
    }

    static int guessApi(int guess, int pick){
        if(guess == pick)
            return 0;
        else if(guess > pick)
            return -1;
        else
            return 1;
    }
}
