/*
1832. Check if the Sentence Is Pangram
Easy

A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
*/

package LeetCode;

import java.util.Scanner;
import java.util.Arrays;

public class Panagram {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it is a panagram or not: ");
        String sentence = sc.nextLine();
        panagram(sentence);
        sc.close();
    }

    static void panagram(String sentence){
        boolean isPangram = true;
        sentence = sentence.toLowerCase();
        if(sentence.length() < 26){
            isPangram = false;
        }
        else{
            for (int i = 'a'; i <= 'z'; i++) {
                if(sentence.indexOf(i) < 0){
                    isPangram = false;
                }
            }
        }
        System.out.println(isPangram);
    }
}
