import java.util.Scanner;

public class InputAndPrint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int rows = s.nextInt();
        System.out.println("enter the no. of cols");
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the " + i + "th row" + j + " jth col ");
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
