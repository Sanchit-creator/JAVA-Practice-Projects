public class length {

    public static Nodes<Integer> createLinkList() {
        Nodes<Integer> n1 = new Nodes<Integer>(10);
        Nodes<Integer> n2 = new Nodes<Integer>(20);
        Nodes<Integer> n3 = new Nodes<Integer>(30);
        Nodes<Integer> n4 = new Nodes<Integer>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    

    public static void print(Nodes<Integer> head) {}
    public static int lengths(Nodes<Integer> head) {
        int count = 0;
        while (head != null) {
            System.out.println(head.data);
            count++;
            head = head.next;
        }
        return count;
    }
    

    public static void main(String[] args) {
        Nodes<Integer> head = createLinkList();
        System.out.println(lengths(head)); 
    }
}
