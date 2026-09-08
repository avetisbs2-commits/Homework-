package generics_homework;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(100);
        Box<String> stringBox = new Box<>("Hello");
        Box<Double> doubleBox = new Box<>(15.5);

        System.out.println(integerBox.getValue());
        System.out.println(stringBox.getValue());
        System.out.println(doubleBox.getValue());

        Pair<String , Integer> keyAge = new Pair<>("Age" , 25);
        Pair<String , String> keyName = new Pair<>("Name" , "Tigran");

        System.out.println(keyAge.getKey() + ": " + keyAge.getValue());
        System.out.println(keyName.getKey() + ": " + keyName.getValue());

        Printer.print(100);
        Printer.print("Hello");
        Printer.print(15.5);
        Printer.print(true);

        Printer.printArray(new Integer[]{1,5,10,20});
        Printer.printArray(new String[]{"Anna" , "John" , "Bob"});

        MyList<Object> myList = new MyList<>();
        myList.add(3);
        myList.add("s");

        System.out.println(myList.size());
        System.out.println(myList.get(0));
    }
}
