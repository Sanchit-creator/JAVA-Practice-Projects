public class checkPalindrome {
    public static boolean palinDrome(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }else {
            boolean ans = palinDrome(s.substring(1, s.length() - 1));
            return ans;
        }
    }

    public static void main(String[] args) {
        String s = "abcdca";
        System.out.println(palinDrome(s));
    }
}
