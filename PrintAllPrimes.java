import java.util.*;

public class PrintAllPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        boolean[] arr = new boolean[n + 1];
        checkPrimes(n, arr);
    }

    static void checkPrimes(int n, boolean[] arr){
        for (int i = 2; i * i <=n ; i++) {
            if(!arr[i]){
                for (int j = i * 2; j <= n ; j += i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }
    }
}
