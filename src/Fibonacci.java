package LeetCode;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;
        int s;
        System.out.print(a + " " + b + " ");
        while( c < n){
            s = a + b;
            System.out.print(s + " ");
            a = b;
            b = s;
            c++;
        }
    }
}
