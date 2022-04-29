import java.util.Scanner;
public class Fruits {
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        String fruit = ip.next();
        switch(fruit){
            case "mango" -> System.out.println("Mango");
            case "orange" -> System.out.println("Orange");
            case "banana" -> System.out.println("Banana");
            case "apple" -> System.out.println("Apple");
            default -> System.out.println("Some fruit");
        }
        ip.close();
    }
}
