package delete;

import java.util.Scanner;

public class delete {
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

    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    	//Your code goes here
		if (head == null)
        {
            return head;
        }
        if (pos==0)
        {
            head=head.next;
            return head;
        }
        else
        {
            Node<Integer> smallerHead=deleteNodeRec(head.next,pos-1);
            head.next=smallerHead;
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
}
