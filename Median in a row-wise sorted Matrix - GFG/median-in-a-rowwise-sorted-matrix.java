// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            String line[] = read.readLine().trim().split("\\s+");
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[c++]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int r, int c) {
        // code here   
        
        int startVal=0,endVal=2000,midVal;
        int n=r*c;
        while(startVal<=endVal)
        {
            midVal=(endVal+startVal)/2;
            int ans=0;
            for(int i=0;i<r;i++)
            {
                int l=0,h=c-1;
                while(l<=h)
                {
                    int m=l+(h-l)/2;
                    if(matrix[i][m]<=midVal) l=m+1;
                    else h=m-1;
                }
                ans+=l;
            }
            if(ans<=n/2) startVal=midVal+1;
            else endVal=midVal-1;
        }
        return startVal;
    }
}