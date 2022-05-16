import java.util.*;

public class FindSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find square root: ");
        int n = sc.nextInt();
        System.out.println("Enter the precision value: ");
        int p = sc.nextInt();
        findRoot(n, p);
    }

    static void findRoot(int n, int p){
        int start = 0;
        int end = n;
        double ans = 0.0;
        while(start <= end){
            int mid = start + (end - start);
            if(mid * mid == n){
                ans = mid;
                break;
            }
            else if(mid * mid > n)
                end = mid - 1;
            else
                start = mid + 1;
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(ans * ans <= n){
                ans += incr;
            }
            ans -= incr;
            incr /= 10;
        }
        System.out.println(ans);
    }
}
