import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // for capacity you can write 
        // ArrayList<Integer> arr = new ArrayList<>(20);
        // add inserts the element in array list
        arr.add(10);
        arr.add(20);
        arr.add(30);
        // if you want to add at particular index add(i, value )
        arr.add(1, 80);
        arr.set(0, 100);
        // remove element and shift element to left and you can remove object too
        arr.remove(2);
        // size is the function that will check how much element s you have add
        System.out.println(arr.size());
        // check e;ement at particular index use get
        System.out.println(arr.get(2));
        System.out.println(arr.get(0));
        

        // for loop

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // enhance for loop for r=each loop

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
