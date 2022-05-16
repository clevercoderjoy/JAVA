import java.util.*;

public class FactorsOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        getFactors(n);
    }

    static void getFactors(int n){
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n / i == i)
                    System.out.print(i);
                else
                    System.out.print(i + " " + n / i + " ");
            }
        }
    }
}
