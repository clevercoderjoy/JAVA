import java.util.Scanner;
public class CountOccurrences {
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        long num = ip.nextLong();
        int digit = ip.nextInt();
        int count = 0;
        while(num != 0){
            if((num % 10) == digit){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
        ip.close();
    }
}
