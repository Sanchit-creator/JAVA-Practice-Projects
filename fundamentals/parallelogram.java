import java.util.Scanner;

public class parallelogram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int currRow = 1;
        int sum = 0;
        while (currRow <= n) {
            sum = currRow + 1;
            int currCol = 1;
            while (currCol <= currRow) {
                System.out.print(currCol);
                if (currCol == currRow) {
                    System.out.print('=');
                }else{
                    System.out.print('+');
                }
                currCol += currCol;
            }
            System.out.println(sum);
            currRow = currRow + 1;
        }
    }
}
