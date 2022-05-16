package LeetCode;
import java.util.*;

public class FibonacciRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.print(printSeries(i) + " ");
            sum += printSeries(i);
        }
        System.out.println(sum);
    }

    static int printSeries(int n){
        if(n < 2){
            return n;
        }
        return printSeries(n - 1) + printSeries(n - 2);
    }
}
