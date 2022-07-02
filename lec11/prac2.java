import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int rows = s.nextInt();
        System.out.println("Enter Number of columns");
        int col = s.nextInt();
        int [][] arr = new int[rows][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println("Enter the element at" + i + " column" + j + "row");
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
