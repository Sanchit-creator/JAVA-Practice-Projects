package src1;
import java.util.Stack;

public class stack {
    public static void main(String[] args) throws stackFullexception, stackEmptyException {
        // stackUsingArray stack = new stackUsingArray(2);

        stackUsingLL<Integer> stack = new stackUsingLL<>();

        int arr[] = {5,6,7,1,9};
        

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Stack usage
        // stack.push(10);
        // System.out.println(stack.top());;
        // stack.pop();
        // stack.size();
        // System.out.println(stack.isEmpty());
    }
}
