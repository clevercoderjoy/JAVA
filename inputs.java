import java.util.Scanner;
public class inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rollNo = input.nextInt();
        System.out.println(rollNo);
        System.out.println("name");
        String name = input.next();
        System.out.println("phrase");
        String phrase = input.nextLine();
        System.out.println(name);
        System.out.println(phrase);
    }
}