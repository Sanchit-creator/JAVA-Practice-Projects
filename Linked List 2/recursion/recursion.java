package recursion;

import java.util.Scanner;

public class recursion {

    // use -1 at the end
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

    public static void printR(Node<Integer> head) {
        if (head == null) {
            return;
        }

        System.out.println(head.data + " ");
        printR(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printR(head);
    }

}
