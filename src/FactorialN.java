import java.util.Scanner;
public class FactorialN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        getNumbers(start, end);
        sc.close();
    }

    static void getNumbers(int start, int end){
        for(int i = start; i <= end; i++){
            System.out.println(factorial(i));
        }
    }

    static int factorial(int i){
        int fact = 1;
        for(int j = 2; j < i; j++){
            fact *= j;
        }
        return fact;
    }
}
