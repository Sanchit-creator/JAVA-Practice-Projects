import java.util.Stack;

public class reverseStack {

    public static void reverseStack(Stack<Integer> stack, Stack<Integer> helper) {
        if (stack.size() == 0 || stack.size() == 1) {
            return;
        }
        int top = stack.pop();
        reverseStack(stack, helper);
        while (!stack.isEmpty()) {
            helper.push(stack.pop());
        }
        stack.push(top);
        while (!helper.isEmpty()) {
            stack.push(helper.pop());
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,7,9,8,5,4};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        for (int elem : arr) {
            stack.push(elem);
        }

        reverseStack(stack, helper);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
