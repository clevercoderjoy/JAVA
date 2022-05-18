// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int l = 0;
        int lMax = 0;
        int r = n - 1;
        int rMax = 0;
        long res = 0;
        while(l <= r){
            if(arr[l] <= arr[r]){
                if(arr[l] > lMax){
                    lMax = arr[l];
                }
                else{
                    res += lMax - arr[l];
                }
                l++;
            }
            else{
                if(arr[r] > rMax){
                    rMax = arr[r];
                }
                else{
                    res += rMax - arr[r];
                }
                r--;
            }
        }
        return res;
    } 
}


