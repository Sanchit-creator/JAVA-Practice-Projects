import java.util.Queue;

public class reverseQueue {
    public static void reverseQueue(Queue<Integer> input) {
        if (input.size() == 0) {
            return;
        }
        int temp = input.poll();
        reverseQueue(input);
        input.add(temp);
    }
}
