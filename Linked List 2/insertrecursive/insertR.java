package insertrecursive;

import java.util.Scanner;

public class insertR {
    public static Node<Integer> takeInput() {


        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> curNode = new Node<Integer>(data);
            if (head == null) {
                head = null;
            }else{
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
    public static Node<Integer> insertR(Node<Integer> head, int elem, int pos) {
        
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            Node<Integer> newNode = new Node<>(elem);
            newNode.next = head;
            return newNode;
        }else {
            head.next = insertR(head, elem, pos - 1);
            return head;
        }
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
        insertR(head, 20, 0);
        printR(head);
    }
}
