import java.util.Scanner;

public class sumofarrays {
    public static int sum(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        return ans;
    }
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at" +i + "th index" );
            arr[i] = s.nextInt();
        } 
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        int sum = sum(arr);
        System.out.println(sum);
    }
}
