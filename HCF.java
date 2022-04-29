package LeetCode;

import java.util.Scanner;
public class HCF {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find the HCF: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int min, hcf = 0;
        if(n1 < n2){
            min = n1;
        }
        else{
            min = n2;
        }
        for(int i = 1; i <= min; i++){
            if((n1 % i == 0) && (n2 % i == 0)){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
