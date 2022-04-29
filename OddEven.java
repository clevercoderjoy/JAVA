import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Odd or Even: \n");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("The number " + num + " is even.");
        }
        else{
            System.out.println("The number " + num + " is odd.");
        }
    }
}
