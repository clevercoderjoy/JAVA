import java.util.Scanner;
public class CaseCheck {
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        char letter = ip.next().charAt(0);
        if(Character.isUpperCase(letter)){
            System.out.println(letter + " is uppercase");
        }
        else{
            System.out.println(letter + " is lowercase");
        }
    }
}
