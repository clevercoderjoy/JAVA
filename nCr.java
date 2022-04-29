package LeetCode;

import java.util.Scanner;
public class nCr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nFact = 1;
        int rFact = 1;
        int nrFact = 1;
        for(int i = 1; i <= n; i++){
            nFact *= i;
        }
        for(int j = 1; j <= r; j++){
            rFact *= j;
        }
        for(int k = 1; k <= (n - r); k++){
            nrFact *= k;
        }
        System.out.println((nFact / (rFact * nrFact)));
    }
}
