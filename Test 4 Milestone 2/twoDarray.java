import java.util.Scanner;

public class twoDarray {

    public static void printArray(int[][] arr) {
        int k = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int l = k - 1; l >= 0; l--) {
                for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            k--;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        printArray(arr); 
    }
}
