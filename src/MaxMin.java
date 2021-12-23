import java.util.Scanner;
public class MaxMin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(max(num1, num2, num3));
        System.out.println(min(num1, num2, num3));
        sc.close();
    }

    static int max(int num1, int num2, int num3){
        int maxNum = num1;
        if(num2 > maxNum && num2 > num3){
            maxNum = num2;
        }
        else if(num3 > num2 && num3 > maxNum){
            maxNum = num3;
        }
        return maxNum;
    }

    static int min(int num1, int num2, int num3){
        int minNum = num1;
        if(num2 < minNum && num2 < num3){
            minNum = num2;
        }
        else if(num3 < minNum && num3 < minNum){
            minNum = num3;
        }
        return minNum;
    }
}