import java.util.*;

public class FindElementsFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is: " + Arrays.toString(arr));
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        findElements(n, arr, k);
    }

    static void findElements(int n, int[] arr, int k){
        int x = n / k;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(!freq.containsKey(arr[i]))
                freq.put(arr[i], 1);
            else{
                int count = freq.get(arr[i]);
                freq.put(arr[i], count + 1);
            }
        }
        for(Map.Entry m : freq.entrySet()){
            int temp = (int)m.getValue();
            if(temp > x)
                System.out.print(m.getKey() + " ");
        }
    }
}
