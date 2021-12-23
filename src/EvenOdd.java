import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(printNumber(start, end));
        sc.close();
    }
    static String printNumber(int start, int end){
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                System.out.println(i + " is even");
            }
            else{
                System.out.println(i + " is: " + "odd");
            }
        }
        return "end";
    }
}
