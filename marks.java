import java.util.Scanner;
public class marks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        for(int i = 0; i < marks.length; i++){
            System.out.println("Enter the marks of subject " + (i + 1));
            marks[i] = sc.nextInt();
        }
        sumOfMarks(marks);
        sc.close();
    }

    static void sumOfMarks(int marks[]){
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            sum =+ marks[i];
        }
        System.out.println(getGrades(sum));
    }

    static String getGrades(int sum){
        String grade = "";
        if(sum >= 91 && sum <= 100){
            grade = "AA";
        }
        else if(sum >= 81 && sum <= 90){
            grade = "AB";
        }
        else if(sum >= 71 && sum <= 80){
            grade = "BB";
        }
        else if(sum >= 61 && sum <= 70){
            grade = "BC";
        }
        else if(sum >= 51 && sum <= 60){
            grade = "CD";
        }
        else if(sum >= 41 && sum <= 50){
            grade = "DD";
        }
        else{
            grade = "Fail";
        }
        return grade;
    }
}
