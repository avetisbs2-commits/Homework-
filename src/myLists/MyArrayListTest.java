package myLists;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

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

        // add(index, value)
        list.add(1, 15);
        System.out.println("After add(1,15): " + list);

        list.add(15);
        System.out.println("After adding another 15: " + list);

        // indexOf / lastIndexOf
        System.out.println("indexOf(15): " + list.indexOf(15));
        System.out.println("lastIndexOf(15): " + list.lastIndexOf(15));
        System.out.println("indexOf(12345): " + list.indexOf(12345));

        // contains
        System.out.println("contains(99): " + list.contains(99));
        System.out.println("contains(12345): " + list.contains(12345));

        // remove(Object)
        list.remove(Integer.valueOf(15));
        System.out.println("After remove(Integer.valueOf(15)): " + list);

        // remove(int)
        list.remove(3);
        System.out.println("After remove(3): " + list);

        // clear
        list.clear();
        System.out.println("After clear(): " + list);
    }
}