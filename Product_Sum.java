import java.util.Scanner;
public class Product_Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;
        int sum = 0;
        int difference = 0;
        while(num != 0){
            int digit = num % 10;
            product *= digit;
            sum += digit;
            num /= 10;
        }
        difference = product - sum;
        System.out.println(difference);
    }
}
