// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int maxCount = 0;
        int row = -1;
        for(int i = 0; i < n; i++){
            int count = binarySearch(arr, i);
            if(count > maxCount){
                maxCount = count;
                row = i;
            }
        }
        return row;
    }
    
    int binarySearch(int[][] arr, int row){
        int start = 0;
        int index = arr[0].length;
        int end = arr[0].length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[row][mid] == 1){
                index = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[0].length - index;
    }
}