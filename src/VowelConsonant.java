import java.util.Scanner;
public class VowelConsonant {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowel = 0;
        int consonant = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if((ch >= 'a') && (ch <= 'z')){
                switch(ch){
                    case 'a', 'e', 'i', 'o', 'u' -> vowel += 1;
                    default -> consonant += 1;
                }
            }
        }
        System.out.println("Vowels: " + vowel + "\nConsonants: " + consonant);
    }
}
