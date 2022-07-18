package printReverse;

import java.util.Scanner;

public class reverseRecursion {
    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> curNode = new Node<Integer>(data);
            if (head == null) {
                head = curNode;
            }else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = curNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void reverse(Node<Integer> head) {
        if (head == null) {
            return;
        }
        reverse(head.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        reverse(head);

    }
}
