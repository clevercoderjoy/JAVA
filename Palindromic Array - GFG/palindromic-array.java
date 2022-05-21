// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
       {
          //add code here.
          int rev;
          int copy;
          for(int i = 0; i < n; i++){
              copy = a[i];
              rev = 0;
              while(a[i] != 0){
                int d = a[i] % 10;
                rev = (rev * 10) + d;
                a[i] /= 10;
            }
            if(rev != copy){
                return 0;
            }
          }
          return 1;
       }
}