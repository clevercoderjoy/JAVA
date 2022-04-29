import java.util.Scanner;
public class SI{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values for P, R, T.\n");
        int p = input.nextInt();
        float r = input.nextFloat();
        int t = input.nextInt();
        float si = ((p * r * t) / 100);
        System.out.println("The Si is: " + si);
        input.close();
    }
}