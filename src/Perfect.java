package LeetCode;

import java.util.Scanner;
public class Perfect {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("LeetCode.Perfect!");
        }
        else{
            System.out.println("Not LeetCode.Perfect!");
        }
    }
}
