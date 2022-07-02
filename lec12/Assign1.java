// import java.util.Scanner;

// public class Assign1 {
//    public static int countWords(String str) {
//        int OUT = 0;
//        int IN = 1;
//        int state = OUT;
//        int wc = 0;
//        for (int i = 0; i < str.length(); ++i) {
//             if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
//                 state = OUT;
//             } else if (state == OUT) {
//                 state = IN;
//                 ++wc;
//             }
//        }
//        return wc;
//    } 
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        int result = countWords(str);
//        System.out.println(result);
//    }
// }
