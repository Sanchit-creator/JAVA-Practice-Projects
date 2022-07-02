import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, d;
        String str = s.next();
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = (a + b + c) / 3;
        System.out.println(str);
        System.out.println(d);
    }
}
