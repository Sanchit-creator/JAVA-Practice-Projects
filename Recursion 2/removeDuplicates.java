public class removeDuplicates {
    public static String duplicates(String s) {
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            String smallOutput = duplicates(s.substring(2));
            return s.charAt(0) + smallOutput;
        }else {
            String smallOutput = duplicates(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        System.out.println(duplicates("aabccdeea"));
    }
}
