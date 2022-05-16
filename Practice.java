
import java.util.*;

public class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = fun(100, 2000);
        System.out.println(ans);

    }
    public static int fun(int A, int B) {
        if (B == 0)
            return A;
        else
            return fun(B, A % B);
    }
}