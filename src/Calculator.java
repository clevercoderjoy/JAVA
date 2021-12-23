import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        while(true){
            System.out.println("Enter two numbers:");
            int num1 = ip.nextInt();
            int num2 = ip.nextInt();
            System.out.println("Enter an operator:");
            char op = ip.next().charAt(0);
            if(op == '+'){
                System.out.println(num1 + num2);
            }
            else if(op == '-'){
                System.out.println(num1 - num2);
            }
            else if(op == '*'){
                System.out.println(num1 * num2);
            }
            else if(op == '/'){
                System.out.println(num1 / num2);
            }
            else if(op == '%'){
                System.out.println(num1 % num2);
            }
            else{
                System.out.println("Invalid operator! Try again!");
            }
            System.out.print("Press any key to continue and x to exit:");
            char ch = ip.next().charAt(0);
            if(Character.toLowerCase(ch) == 'x'){
                break;
            }
        }
        ip.close();
    }
}
