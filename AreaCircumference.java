import java.util.Scanner;

public class AreaCircumference {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        final float pie = 3.14f;
        int r = sc.nextInt();
        System.out.println("Area is: " + area(pie, r));
        System.out.println("Circumference is: " + circumference(pie, r));
        sc.close();
    }

    static float area(float pie, int r){
        return (pie * r * r);
    }

    static float circumference(float pie, int r){
        return (2 * pie * r);
    }
}
