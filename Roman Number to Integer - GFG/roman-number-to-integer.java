// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        // code here
        int n = s.length();
        HashMap<Character, Integer> r = new HashMap<>();
        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);
        int ans = 0;
        if(n == 0){
            return ans;
        }
        for(int i = 0; i < n; i++){
            if(i < n - 1 && r.get(s.charAt(i)) < r.get(s.charAt(i + 1))){
                ans += r.get(s.charAt(i + 1)) - r.get(s.charAt(i));
                i++;
            }
            else{
                ans += r.get(s.charAt(i));
            }
        }
        return ans;
    }
}