public class DeleteNode {

    public static LinkNode<Integer> createLinkList() {
        LinkNode<Integer> n1 = new LinkNode<Integer>(10);
        LinkNode<Integer> n2 = new LinkNode<Integer>(20);
        LinkNode<Integer> n3 = new LinkNode<Integer>(30);
        LinkNode<Integer> n4 = new LinkNode<Integer>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static void print(LinkNode<Integer> head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

        // System.out.println(head.data);
        // System.out.println(head.next);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
    }
    public static LinkNode<Integer> delete(LinkNode<Integer> head, int pos) {

        if (head == null) {
            return head;
        }

        if (pos == 0) {
            return head.next;
        }
        LinkNode<Integer> prev = head;
        int count = 0;
        while (prev != null && count < (pos - 1)) {
            prev = prev.next;
            count++;
        }
        if (prev == null || prev.next == null) {
            return head;
        }

        prev.next = prev.next.next;

        return head;
    }

    public static void main(String[] args) {
        LinkNode<Integer> head = createLinkList();
        delete(head, 2);
        print(head);
    }
}
