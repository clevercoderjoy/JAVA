import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListEg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(5);
        for(int i = 1; i <= 5; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}