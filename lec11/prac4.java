import java.util.Scanner;

public class prac4 {
    public static void print2darray(int[][] arr) {
        int rows = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int largestCol(int[][] arr) {
        int rows = arr.length;
        int col = arr[0].length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > largest) {
                largest = sum;
            }
        }
        return largest;
    }

    public static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int rows = s.nextInt();
        System.out.println("Enter Number of columns");
        int col = s.nextInt();
        int [][] arr = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element at" + i + " row" + j + "column");
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = takeInput();
        
        int largestColSum = largestCol(arr);
        System.out.println(largestColSum);
    }
}
