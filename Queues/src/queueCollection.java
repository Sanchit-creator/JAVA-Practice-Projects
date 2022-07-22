import java.util.LinkedList;
import java.util.Queue;

public class queueCollection {
    public static void main(String[] args) {

        // this will throw error because queue is an interface
        // Queue<Integer> queue = new Queue<Integer>();

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.size());
        // to see front element
        System.out.println(queue.peek());
        // to remove  first element
        System.out.println(queue.poll());
    }
}
