package myLists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List<Integer> {
    Object[] elements = new Object[0];

    // ===== size / isEmpty =====

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements
     */
    @Override
    public int size() {
        return elements.length;
    }

    /**
     * Checks whether this list contains no elements.
     *
     * @return true if the list is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    // ===== add =====

    /**
     * Appends the given value to the end of this list.
     *
     * @param value the element to add
     * @return true (as specified by Collection.add)
     */
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

    /**
     * Inserts the given value at the specified index, shifting
     * any subsequent elements to the right.
     *
     * @param index the index at which to insert the value
     * @param value the element to insert
     * @throws IndexOutOfBoundsException if index is out of range
     */
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

    /**
     * Returns the element at the specified index.
     *
     * @param index the index of the element to return
     * @return the element at the specified index
     * @throws IndexOutOfBoundsException if index is out of range
     */
    @Override
    public Integer get(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException();
        }
        return (Integer) elements[index];
    }

    /**
     * Replaces the element at the specified index with the given value.
     *
     * @param index the index of the element to replace
     * @param value the new value
     * @return the element previously at the specified index
     * @throws IndexOutOfBoundsException if index is out of range
     */
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

    /**
     * Removes the element at the specified index, shifting any
     * subsequent elements to the left.
     *
     * @param index the index of the element to remove
     * @return the element that was removed
     * @throws IndexOutOfBoundsException if index is out of range
     */
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

    /**
     * Removes the first occurrence of the specified value from this list,
     * if it is present.
     *
     * @param o the element to remove
     * @return true if the element was found and removed, false otherwise
     */
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

    /**
     * Returns the index of the first occurrence of the specified value,
     * or -1 if this list does not contain it.
     *
     * @param o the element to search for
     * @return the index of the first occurrence, or -1 if not found
     */
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

    /**
     * Returns the index of the last occurrence of the specified value,
     * or -1 if this list does not contain it.
     *
     * @param o the element to search for
     * @return the index of the last occurrence, or -1 if not found
     */
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

    /**
     * Checks whether this list contains the specified value.
     *
     * @param o the element to check for
     * @return true if this list contains the element, false otherwise
     */
    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }


    // ===== clear =====

    /**
     * Removes all elements from this list.
     */
    @Override
    public void clear() {
        elements = new Object[0];
    }

    // ===== toString =====

    /**
     * Returns a string representation of this list, formatted as a
     * comma-separated sequence of elements enclosed in square brackets.
     *
     * @return a string representation of this list
     */
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