package myLists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList implements List {
    Object[] elements = new Object[0];

    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private int size = 0;

    /**
     * Finds and returns the node located at the given index by walking
     * the chain from the head, one link at a time.
     *
     * This is a private helper used internally by other methods (get,
     * set, add, remove) so they don't each have to repeat the same
     * walking logic themselves.
     *
     * @param index the position to look for, where 0 is the first node
     * @return the Node currently sitting at that position
     * @throws IndexOutOfBoundsException if index is negative or is not
     *         less than the current size of the list
     */

    private Node nodeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    // ===== size / isEmpty =====

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks whether this list contains no elements.
     *
     * @return true if the list is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // ===== indexOf =====

    /**
     * Returns the index of the first occurrence of the specified value,
     * or -1 if this list does not contain it.
     *
     * @param o the element to search for
     * @return the index of the first occurrence, or -1 if not found
     */
    @Override
    public int indexOf(Object o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == null) {
                if (o == null) {
                    return index;
                }
            } else if (current.value.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // ===== contains =====

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


    // ===== add =====

    /**
     * Appends the given value to the end of this list.
     *
     * @param value the element to add
     * @return true (as specified by Collection.add)
     */
    @Override
    public boolean add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    // ===== clear =====

    /**
     * Removes all elements from this list.
     */
    @Override
    public void clear() {
        head = null;
        size = 0;
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
    public Object get(int index) {
        return nodeAt(index).value;
    }

    /**
     * Replaces the element at the specified index with the given value.
     *
     * @param index the index of the element to replace
     * @param value the new value
     * @return null (the previous value is not currently returned)
     * @throws IndexOutOfBoundsException if index is out of range
     */
    @Override
    public Object set(int index, Object value) {
        Node node = nodeAt(index);
        node.value = value;
        return null;
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
        Node current = head;
        while (current != null) {
            result += current.value;
            if (current.next != null) {
                result += ", ";
            }
            current = current.next;
        }
        result += "]";
        return result;
    }

    // ===== Not Implemented =====

    @Override
    public boolean remove(Object o) {
        return true;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}