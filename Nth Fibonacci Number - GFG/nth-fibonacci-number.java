// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long nthFibonacci(long n){
        // code here
        if(n == 0){
            return 0;
        }
        if(n <= 2){
            return 1;
        }
        long a = 1;
        long b = 1;
        long c = 0;
        long i = 3;
        while(i <= n){
            c = a + b;
            c = c % 1000000007;
            a = b;
            b = c;
            i++;
        }
        return c;
    }
}