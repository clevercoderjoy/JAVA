import java.util.Scanner;
public class operators {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers and an operator.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        char ch = input.next().charAt(0);
        if( ch == '+'){
            System.out.println(num1 + num2);
        }
        else if(ch == '-'){
            System.out.println(num1 - num2);
        }
        else if(ch == '*'){
            System.out.println(num1 * num2);
        }
        else if(ch == '/'){
            System.out.println(num1 / num2);
        }
        else{
            System.out.println("Invalid operator!");
        }
    }
}
