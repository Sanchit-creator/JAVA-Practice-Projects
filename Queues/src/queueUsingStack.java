import java.util.Stack;

public class queueUsingStack<T> {
    Stack<T> s1;
    Stack<T> s2;

    public queueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueu(T elem) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(elem);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int dequeu() {
        if (s1.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }

        int elem = (int) s1.peek();
        s1.pop();
        return elem;
    }
    public static void main(String[] args) 
        { 
    queueUsingStack<Integer> q = new queueUsingStack<>(); 
    q.enqueu(1); 
    q.enqueu(2); 
    q.enqueu(3); 
  
    System.out.println(q.dequeu()); 
    System.out.println(q.dequeu());
    System.out.println(q.dequeu());
} 
}
