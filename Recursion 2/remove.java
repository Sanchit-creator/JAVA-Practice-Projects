public class remove {

    public static String remove(String s, char a) {
        if (s.length() == 0) {
            return s;
        }
        String smallOutput = remove(s.substring(1), a);
        String b = "";
        if (s.charAt(0) == a) {
            return b + smallOutput;
        }else{
            return s.charAt(0) + smallOutput;
        }
    }

    public static void main(String[] args) {
        System.out.println(remove("axbxdxsx", 'x'));
    }
}
