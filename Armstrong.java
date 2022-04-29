package LeetCode;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = ip.nextInt();
        int copyNum = num;
        int check = 0;
        while(num != 0){
            check += (num % 10) * (num % 10) * (num % 10);
            num = num / 10;
        }
        if(copyNum == check){
            System.out.println("The number is an Armstrong number.");
        }
        else{
            System.out.println("The number is not an Armstrong number.");
        }
        ip.close();
    }
}
