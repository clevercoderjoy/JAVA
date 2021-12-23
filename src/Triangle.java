import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the breadth and height for triangle:");
        int b = sc.nextInt();
        int h = sc.nextInt();
        System.out.println((b * h) / 2);
        sc.close();
    }
}
