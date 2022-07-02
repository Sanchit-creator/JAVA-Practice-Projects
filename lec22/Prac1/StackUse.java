package Prac1;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException, StackEmptyException {
        // StackUsingarray stack = new StackUsingarray();
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        int arr[] = {5, 6, 7, 1, 9};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (! stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        // stack.data[1] = 100;
        stack.push(10);
        stack.top();
        stack.pop();
        stack.size();
        stack.isEmpty();
    }
}
