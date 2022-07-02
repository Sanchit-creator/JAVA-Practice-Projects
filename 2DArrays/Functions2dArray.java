import java.util.Scanner;

public class Functions2dArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  Number of Rows: ");
        int rows = s.nextInt();
        System.out.println("Enter Number of Cols: ");
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at " +i+ " row " +j+ " col");
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
