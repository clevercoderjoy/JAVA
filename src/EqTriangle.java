import java.util.Scanner;
import java.lang.Math;
public class EqTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println((Math.sqrt(3) / 4) * (s * s));
        sc.close();
    }
}
