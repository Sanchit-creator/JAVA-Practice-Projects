public class multiply2LL {

    public static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data){
            this.data = data;
        }
    }

    public static void multiply(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        long N = 1000000007;
        long num1 = 0, num2 = 0;

        while (head1 != null || head2 != null) {
            if (head1 != null) {
                num1 = ((num1)*10)%N + head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                num2 = ((num2)*10)%N + head2.data;
                head2 = head2.next;
            }
        }
        System.out.println(((num1%N)*(num2%N))%N);
    }

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head1 = new LinkedListNode<Integer>(8);
        head1.next = new LinkedListNode<Integer>(4);
        head1.next.next = new LinkedListNode<Integer>(5);
        print(head1);

        LinkedListNode<Integer> head2 = new LinkedListNode<Integer>(4);
        head2.next = new LinkedListNode<Integer>(5);
        print(head2);

        multiply(head1, head2);


    }
}
