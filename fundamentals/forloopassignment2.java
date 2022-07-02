import java.util.Scanner;

public class forloopassignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int choice = s.nextInt();
        if (choice == 1) {
            int sum = 0, num = 1;
            while (num <= n) {
                sum += num;
                num++;
            }
            System.out.println(sum);
        }
        else if (choice == 2) {
            int prod = 1, num = 1;
            while (num <= n) {
                prod = prod*num;
                num++;
            }
            System.out.println(prod);
        }
        else {
            System.out.println(-1);
        }
    }
}
