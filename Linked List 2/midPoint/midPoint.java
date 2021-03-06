package midPoint;

import java.util.Scanner;

public class midPoint {

    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                head = currentNode;
            }else{
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    
    
    public static Node<Integer> midPoint(Node<Integer> head) {
        Node<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }

    public static void printR(Node<Integer> head) {
        if (head == null) {
            return;
        }

        System.out.println(head.data + " ");
        printR(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> mid = midPoint(head);
        System.out.println(mid.data);
    }
}
