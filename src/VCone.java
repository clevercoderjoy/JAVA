import java.util.Scanner;
import java.lang.Math;
public class VCone {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        final float pi = 3.14f;
        int r = sc.nextInt();
        int h = sc.nextInt();
        System.out.println((pi * (r * r) * h) / 3);
    }
}
