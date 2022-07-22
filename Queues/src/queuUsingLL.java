public class queuUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;

    public queuUsingLL() {
        front = null;
        rear = null;
        size = 0;   
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueu(T elem) {
        Node<T> newNode = new Node<>(elem);
        size++;
        if (front == null) {
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T front() throws queuEmptyException{
        if (front == null) {
             throw new queuEmptyException();
        }
        return front.data;
    }

    public T dequeu() throws queuEmptyException {
        if (front == null) {
            throw new queuEmptyException();
        }
        T temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return temp;
    }
}
