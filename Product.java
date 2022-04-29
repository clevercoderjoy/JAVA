import java.util.Scanner;
public class Product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(product(num1, num2));
        sc.close();
    }

    static int product(int num1, int num2){
        return num1 * num2;
    }
}
