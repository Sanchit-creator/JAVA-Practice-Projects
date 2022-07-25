import java.sql.Time;

public class moveToLast {
    public static class Node<T> {
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
        }
    }
    public static Node<Integer> func(Node<Integer> head, int n) {
        Node<Integer> temp = head, prev = null, last = null;
        int len = 1;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        last = temp;
        temp = head;
        for (int i = 0; i < len; i++) {
            if (temp.data == n) {
                if (prev == null) {
                    Node<Integer> temp2 = new Node<Integer>(temp.data);
                    head = head.next;
                    last.next = temp2;
                    prev = null;
                    temp = head;
                }else {
                    Node<Integer> temp2 =new Node<Integer>(temp.data);
                    prev.next = temp.next;
                    last.next = temp2;
                    temp = temp.next;
                }
                last = last.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    } 

}
