package prac2;

public class linklistuse {


    public static node<Integer> createdLinkedList() {
        node<Integer> n1 = new node<>(10);
        node<Integer> n2 = new node<>(20);
        node<Integer> n3 = new node<>(30);
        node<Integer> n4 = new node<>(40);
        n1.next = n2;
        // System.out.println("n1 " +n1 + "data" +n1.data + "next" +n1.next);
        n2.next = n3;
        // System.out.println("n2 " +n2 + "data" +n2.data + "next" +n2.next);
        n3.next = n4;
        // System.out.println("n3 " +n3 + "data" +n3.data + "next" +n3.next);
        // System.out.println("n4 " +n4 + "data" +n4.data + "next" +n4.next);
        return n1;
    }
    public static void print(node<Integer> head) {
        System.out.println("Print" + head);
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }

        // System.out.println(head.next);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
    }
    public static void main(String[] args) {
        node<Integer> head = createdLinkedList();
        print(head);
    }

}
