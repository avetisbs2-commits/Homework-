package generics_homework;

import java.util.ArrayList;

public class MyList <T> {
    ArrayList<T> elements = new ArrayList<>();

    public int size(){
        return elements.size();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T get(int index) {
       return elements.get(index);
    }
}
