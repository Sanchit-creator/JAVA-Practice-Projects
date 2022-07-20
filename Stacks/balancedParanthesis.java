import java.util.Stack;

public class balancedParanthesis {
    public static boolean balancedParanthe(String str) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                st.push(str.charAt(i));
            }else if ( !st.empty() && ((str.charAt(i) == ']' && st.peek() == '[') || 
            (str.charAt(i) == '}' && st.peek() == '{') ||
            (str.charAt(i) == ')' && st.peek() == '('))) {
                st.pop();
            }else {
                st.push(str.charAt(i));
            }
        }
        if(st.empty()) {
            return true;
       } else {
            return false;
       }
    }

    public static void main(String[] args) {
        String str = "{(}";
        System.out.println(balancedParanthe(str));
    }
}
