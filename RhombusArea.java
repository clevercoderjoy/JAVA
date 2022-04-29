import java.util.Scanner;
import java.lang.Math;
public class RhombusArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(b * b * Math.sin(a));
    }
}
