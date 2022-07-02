package Prac1;

public class StackUsingArray {
    private int data[];
    private int topIndex;

    public StackUsingArray(int size) {
        data = new int[10];
        topIndex = -1;
    }

    public StackUsingArray() {
        data = new int[2];
        topIndex = -1;
    }

    public int size() {
        return topIndex + 1;
    }
    public void push(int elem){
        if (topIndex == data.length - 1) {
            // throw new StackFullException();
            doubleCapacity();
        }
        data[++topIndex] = elem;
    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 1; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public int top() throws StackEmptyException{
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    public int pop() throws StackEmptyException{
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}
