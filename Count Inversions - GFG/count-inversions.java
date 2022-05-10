// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        int n = arr.length;
        long[] temp = new long[n];
        return mergeSort(arr, temp, 0, n - 1);
    }
    
    static long mergeSort(long[] arr, long[] temp, int start, int end){
        long count = 0;
        if(start < end){
            int mid = start + (end - start) / 2;
            count += mergeSort(arr, temp, start, mid);
            count += mergeSort(arr, temp, mid + 1, end);
            count += merge(arr, temp, start, mid, end);
        }
        return count;
    }
    
    static long merge(long[] arr, long[] temp, int start, int mid, int end){
        long count = 0;
        int i = start;
        int j = mid + 1;
        int k = start;
        while((i <= mid) && (j <= end)){
            if(arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else{
                temp[k++] = arr[j++];
                count += mid -i + 1;
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= end){
            temp[k++] = arr[j++];
        }
        for(i = start; i <= end; i++){
            arr[i] = temp[i];
        }
        return count;
    }
}