package LeetCode;

import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        getNumber(start, end);
    }

    static void getNumber(int start, int end){
        for(int i = start; i <= end; i++){
            System.out.println(checkPrime(i));
        }
    }

    static String checkPrime(int i){
        boolean flag = true;
        for(int j = 2; j < i; j++){
            if(i % j == 0){
                flag = false;
                break;
            }
        }
        if(!flag){
            return (i + " is not prime.");
        }
        else{
            return (i + " is prime.");
        }
    }
}
