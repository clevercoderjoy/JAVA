import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int negativeSum = 0; int evenSum = 0; int oddSum = 0;
        int num = sc.nextInt();
        while (num != 0){
            if(num < 0){
                negativeSum += num;
            }
            else{
                if(num % 2 == 0){
                    evenSum += num;
                }
                else{
                    oddSum += num;
                }
            }
            System.out.println("Enter a number to add or 0 to exit:");
            num = sc.nextInt();
            if(num == 0){
                break;
            }
        }
        System.out.println("Sum of negative numbers: " + negativeSum + "\nSum of positive even numbers: " + evenSum + "\nSum of positive odd numbers: " + oddSum);
    }
}
