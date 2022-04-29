import java.util.Scanner;
public class Circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        final float pi = 3.14f;
        int radius = sc.nextInt();
        System.out.println("Radius of circle is: " + (pi * (radius * radius)));
    }
}
