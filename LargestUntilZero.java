import java.util.Scanner;
public class LargestUntilZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int largest = num;
        while(num != 0){
            if( num > largest){
                largest = num;
            }
            System.out.println("Enter a number to find final largest or Enter 0 to exit:");
            num = sc.nextInt();
            if(num == 0){
                break;
            }
        }
        System.out.println("Largest: " + largest);
    }
}
