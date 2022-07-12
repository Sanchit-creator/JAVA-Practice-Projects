public class appendlastN {
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		if(n == 0 || head == null){
        return head;
    }
    LinkedListNode<Integer> fast = head;
    LinkedListNode<Integer> slow = head;
    LinkedListNode<Integer> initialhead = head;
    for(int i = 0; i < n; i++){
        fast = fast.next;
    }
    while(fast.next != null){
        slow = slow.next;
        fast = fast.next;
    }
    LinkedListNode<Integer> temp = slow.next;
    slow.next = null;
    fast.next = initialhead;
    head = temp;
    return head;
	}
}
