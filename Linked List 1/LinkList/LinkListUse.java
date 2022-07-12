import java.util.Scanner;

public class LinkListUse {

    public static Node<Integer> createLinkList() {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    // Take Input
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

    public static void print(Node<Integer> head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

        // System.out.println(head.data);
        // System.out.println(head.next);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
    }


    public static void main(String[] args) {

        Node<Integer> head = createLinkList();
        print(head);
        // Node<Integer> n1 = new Node(10);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
    }
}
