public class LinkListUse {

    public static LinkListNode<Integer> createLinkList() {
        LinkListNode<Integer> n1 = new LinkListNode<Integer>(10);
        LinkListNode<Integer> n2 = new LinkListNode<Integer>(20);
        LinkListNode<Integer> n3 = new LinkListNode<Integer>(30);
        LinkListNode<Integer> n4 = new LinkListNode<Integer>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static void print(LinkListNode<Integer> head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

        // System.out.println(head.data);
        // System.out.println(head.next);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
    }

    public static LinkListNode<Integer> insert(LinkListNode<Integer> head, int pos, int data) {
        int currPos = 0;
        LinkListNode<Integer> newNode = new LinkListNode<Integer>(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        LinkListNode<Integer> temp = head;
        while (temp != null && currPos < (pos - 1)) {
            temp = temp.next;
            currPos++;
        }
        if (temp == null) {
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        LinkListNode<Integer> head = createLinkList();
        insert(head, 2, 3);
        print(head);
    }
}
