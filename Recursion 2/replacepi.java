public class replacepi {
    public static String pi(String s) {
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
            String smallOutput = pi(s.substring(2));
            return "3.14" + smallOutput;
        }else {
            String smallOutput = pi(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        System.out.println(pi("apicdpi"));
    }
}
