import java.util.Scanner;
public class Welcome {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name! \n");
        String name = input.next();
        System.out.println("Hello " + name + "!");
        input.close();
    }
}
