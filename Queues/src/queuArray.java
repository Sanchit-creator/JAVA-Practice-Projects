public class queuArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public queuArray() {
        data = new int[5];
        front = -1;
        rear = -1;
    }

    public queuArray( int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int elem) throws queuFullException{
        if (size == data.length) {
            // throw new queuFullException();

            doubleCapacity();
        }
        if (size == 0) {
            front = 0;
        }
        rear++;
        data[rear] = elem;
        size++;
    }

    // circular queues

    // public void enqueue(int elem) throws queuFullException{
    //     if (size == data.length) {
    //         throw new queuFullException();
    //     }
    //     if (size == 0) {
    //         front = 0;
    //     }
    //     rear++;
    //     if (rear == data.length) {
    //         rear = 0;
    //     }
    //     data[rear] = elem;
    //     size++;
    // }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];

        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index++] = temp[i];
        }

        for (int i = 0; i < front - 1; i++) {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;
    }

    public int front() throws queuEmptyException {
        if (size == 0) {
            throw new queuEmptyException();
        }
        return data[front];
    }

    public int dequeue() throws queuEmptyException {
        if (size == 0) {
            throw new queuEmptyException();
        }
        int temp = data[front];
        front++;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
