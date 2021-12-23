import java.util.Scanner;
public class SumOfNumbersF {
    public static void main(String args[]){
        System.out.println(takeInput());
    }

    static int takeInput(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        return calculateSum(num1, num2);
    }

    static int calculateSum(int num1, int num2){
        return num1 + num2;
    }
}
