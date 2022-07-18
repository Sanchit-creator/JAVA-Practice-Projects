package CollectionsLL;

import java.util.LinkedList;

public class collectionLL {
    public static void main(String[] args) {
        // to use java linkedlist

        // this will create the object
        LinkedList<Integer> list = new LinkedList<>();
        //add element
        list.add(10);
        list.add(20);
        list.add(1, 100);
        list.addFirst(80);

        // this will not change size of ll just change value of the position

        list.set(0, 60);

        // will remove first value
        list.remove();
        // to print value
        System.out.println(list.get(1));
        // to check size
        System.out.println(list.size());

        // to travel 
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
