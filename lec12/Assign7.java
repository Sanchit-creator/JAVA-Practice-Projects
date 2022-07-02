public class Assign7 {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // String ch2 = ""; 
        int n = str.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ch) {
                ans += str.charAt(i);
            }
        }
        return ans;
	}
}


