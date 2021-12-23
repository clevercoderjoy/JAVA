import java.util.Scanner;
public class CheckAge {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to check:");
        int age = sc.nextInt();
        System.out.println(ageCheck(age));
        sc.close();
    }

    static String ageCheck(int age){
        if(age >= 18){
            return "Eligible!";
        }
        else{
            return "Not Eligible!";
        }
    }
}
