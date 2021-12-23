import java.util.Scanner;
public class SumUntilZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0){
            sum += num;
            System.out.println("Enter a number to add or Enter 0 to exit:");
            num = sc.nextInt();
            if (num == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
