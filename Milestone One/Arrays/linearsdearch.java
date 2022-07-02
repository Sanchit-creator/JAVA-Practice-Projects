import java.util.Scanner;

public class linearsdearch {

    public static int linearSearch(int arr[], int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
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
        int lin = linearSearch(arr, 3);
        System.out.println(lin);
    }
}
