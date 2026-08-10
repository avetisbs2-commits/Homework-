package MyLists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List<Integer> {
    Object[] elements = new Object[0];

    // ===== size / isEmpty =====

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    // ===== add =====

    @Override
    public boolean add(Integer value) {

        Object[] newElements = new Object[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        newElements[elements.length] = value;
        elements = newElements;
        return true;
    }

    @Override
    public void add(int index, Integer value) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException();
        }
        Object[] newElements = new Object[elements.length + 1];

        for (int i = 0; i < index; i++) {
            newElements[i] = elements[i];
        }

        newElements[index] = value;

        for (int i = index; i < elements.length; i++) {
            newElements[i + 1] = elements[i];
        }
        elements = newElements;
    }

    // ===== get / set =====

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException();
        }
        return (Integer) elements[index];
    }

    @Override
    public Integer set(int index, Integer value) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException();
        }
        Integer old = (Integer) elements[index];
        elements[index] = value;
        return old;
    }

    // ===== remove =====

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException();
        }
        Integer removed = (Integer) elements[index];
        Object[] newElements = new Object[elements.length - 1];

        for (int i = 0; i < index; i++) {
            newElements[i] = elements[i];
        }

        for (int i = index + 1; i < elements.length; i++) {
            newElements[i - 1] = elements[i];
        }
        elements = newElements;
        return removed;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index < 0) {
            return false;
        }
        remove(index);
        return true;
    }

    // ===== indexOf / contains =====

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                if (o == null) {
                    return i;
                }
            } else if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = elements.length - 1; i >= 0; i--) {
            if (elements[i] == null) {
                if (o == null) {
                    return i;
                }
            } else if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }


    // ===== clear =====

    @Override
    public void clear() {
        elements = new Object[0];
    }

    // ===== toString =====

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < elements.length; i++) {
            result += elements[i];
            if (i < elements.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    //     NOT implemented.

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }
}