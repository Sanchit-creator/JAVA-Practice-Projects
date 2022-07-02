public class Assign4 {
    public static String reverseWordWise(String input) {
		int end = input.length();
        int i = input.length() - 1;
        String output = "";
        while (i >= 0) {
            if (input.charAt(i) == ' ') {
                output = output + input.substring(i + 1, end) + " ";
                end = i;
            }
            i--;
        }     
        output += input.substring(i + 1, end);
        return output;
	}
    public static void main(String[] args) {
        String input = "I am geek";
        System.out.println(reverseWordWise(input));
    }
}
