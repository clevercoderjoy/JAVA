package LeetCode;

import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        for(int i = numA; i <= numB; i++){
            int fact = 1;
            for(int j = 1; j <= i; j++){
                fact = fact * j;
            }
            System.out.println("LeetCode.Factorial of " + i + " is: " + fact);
        }
    }
}
