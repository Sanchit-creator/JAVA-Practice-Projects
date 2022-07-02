package prac3;

public class dynamicarray {
    private int data[];
    private int nextElementIndex;
    public dynamicarray(){
        data = new int[5];
        nextElementIndex = 0;
    }
    public int size(){
        return nextElementIndex;
    }
    public boolean isEmpty() {
        return nextElementIndex == 0;
    }
    public int get(int i){
        if (i >= nextElementIndex) {
            return -1;
        }
        return data[i];
    }
}
