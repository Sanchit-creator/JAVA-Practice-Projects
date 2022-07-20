package src1;
public class stackUsingArray {
    
    // vreference to the arralist
    private int data[];
    // refereence to the top most index in arrays
    private int topIndex;
    public stackUsingArray(int size) {
        data = new int[size];
        topIndex = -1;
    }

    
    public int size() {
        return topIndex + 1;
    }

    public boolean isEmpty() {
        if (topIndex == -1) {
            return true;
        }else{
            return false;
        }
    }

    // single sized stack

    // public void push(int elem) throws stackFullexception {
    //     // if stak full

    //     if (topIndex == data.length - 1) {
    //         // throw exception

    //         throw new stackFullexception();
    //     }

    //     data[++topIndex] = elem;
    // }

    // double sized stack

    public void push(int elem){
        // if stack full

        if (topIndex == data.length - 1) {
            // throw exception
            doubleCapacity();
        }

        data[++topIndex] = elem;
    }


    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }


    public int top() throws stackEmptyException {
        if (topIndex == -1) {
            throw new stackEmptyException();
        }
        return data[topIndex];
    }

    public int pop() throws stackEmptyException {
        if (topIndex == -1) {
            throw new stackEmptyException();
        }

        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

}
