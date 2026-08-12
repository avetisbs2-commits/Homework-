package MyLists;

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

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // ===== indexOf =====

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

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }


    // ===== add =====

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

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    // ===== get / set =====

    @Override
    public Object get(int index) {
        return nodeAt(index).value;
    }

    @Override
    public Object set(int index, Object value) {
        Node node = nodeAt(index);
        node.value = value;
        return null;
    }

    // ===== toString =====

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
