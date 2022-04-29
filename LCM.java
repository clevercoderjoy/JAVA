package LeetCode;

import java.util.Scanner;
public class LCM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = 1;
        int lcm;
        int min;
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
        lcm = (n1 * n2) / hcf;
        System.out.println(lcm);
    }
}
