package LeetCode;
import java.io.File;
import java.util.*;

public class PickRandomQuestion {
    public static void main(String[] args) {
        List<String> results = new ArrayList<String>();
        File[] files = new File("D:\\Practise\\JAVA\\src\\LeetCode").listFiles();
        assert files != null;
        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
            }
        }
        int question = new Random().nextInt(results.size());
        while(results.get(question).equals("PickRandomQuestion.java") || results.get(question).equals("Practice.java")){
            question = new Random().nextInt(results.size());
        }
        System.out.println(results.get(question));
    }
}
