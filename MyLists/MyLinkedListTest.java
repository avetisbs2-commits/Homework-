package MyLists;

import java.util.ArrayList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // isEmpty / size
        System.out.println("isEmpty: " + list.isEmpty());
        System.out.println("size: " + list.size());

        // add(value)
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add(10,20,30): " + list);

        // get
        System.out.println("get(2): " + list.get(2));

        // set
        list.set(1, 99);
        System.out.println("After set: " + list);

        // indexOf
        System.out.println("indexOf(20): " + list.indexOf(99));
        System.out.println("indexOf(12345): " + list.indexOf(12345));

        // contains
        System.out.println("contains(99): " + list.contains(99));
        System.out.println("contains(12345): " + list.contains(12345));

        // clear
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
