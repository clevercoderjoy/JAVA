/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0; i < n; i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i = 0; i < n / 2; i++){
		        swap(arr, i, n - i - 1);
		    }
		    for(int ele : arr){
		        System.out.print(ele + " ");
		    }
		    System.out.println();
		    t--;
		}
	}
	
	public static void swap(int[] arr, int start, int end){
	    int temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;
	}
}