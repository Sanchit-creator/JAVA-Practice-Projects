public class printnode {

    public static LinkedListNode<Integer> createLinkList() {
        LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(10);
        LinkedListNode<Integer> n2 = new LinkedListNode<Integer>(20);
        LinkedListNode<Integer> n3 = new LinkedListNode<Integer>(30);
        LinkedListNode<Integer> n4 = new LinkedListNode<Integer>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static void printIthNode(LinkedListNode<Integer> head,int i) {

		int position = 0;
    LinkedListNode<Integer> temp = head;
    while(temp != null && position < i){
        temp = temp.next;
        position++;
    }
    if(temp != null) {
        System.out.println(temp.data);
    }

	}

    public static void main(String[] args) {
        LinkedListNode<Integer> head = createLinkList();
        printIthNode(head, 2); 
    }


}
