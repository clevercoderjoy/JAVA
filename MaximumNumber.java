import java.util.Scanner;
public class MaximumNumber {
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter three numbers.");
        int num1 = ip.nextInt();
        int num2 = ip.nextInt();
        int num3 = ip.nextInt();
        int max = num1;
        if(num2 > max && num2 > num3){
            max = num2;
        }
        else if(num3 > max && num3 > num2){
            max = num3;
        }
        System.out.println("Maximum number is: " + max);
        ip.close();
    }
}
