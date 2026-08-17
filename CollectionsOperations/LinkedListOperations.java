package CollectionsOperations;

import java.util.Arrays;
import java.util.LinkedList;

import static java.util.Collections.*;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("a", "b", "c", "b", "a"));
        System.out.println("List: " + list);


        // 11. Reverse a LinkedList
        LinkedList<String> reversed = new LinkedList<>(list);
        reverse(reversed);
        System.out.println("Reversed: " + reversed);


        // 12. Find the Middle Node
        String middle = findMiddle(list);
        System.out.println("Middle node: " + middle);


        // 13. Palindrome Check
        System.out.println("Palindrome check: " + isPalindrome(list));


        // 14. Remove Duplicates
        LinkedList<String> noDuplicates = new LinkedList<>();
        for (String s : list) {
            if (!noDuplicates.contains(s)) {
                noDuplicates.add(s);
            }
        }
        System.out.println("NoDuplicates: " + noDuplicates);
    }


    /**
     * Finds the middle element of a LinkedList
     * @param list the list to search; must not be empty
     * @return the single middle element for odd-length lists, or both middle
     *         elements for even-length lists
     */
    public static String findMiddle(LinkedList<String> list) {
        int step = 0;
        int doubleStep = 0;

        while (doubleStep < list.size() - 1) {
            step++;
            doubleStep += 2;
        }

        if (list.size() % 2 == 0) {
            return list.get(step - 1) + " and " + list.get(step);
        } else {
            return list.get(step);
        }
    }


    /**
     * Checks whether a LinkedList reads the same forwards and backwards.
     * @param list the list to check
     * @return {@code true} if the list is a palindrome, {@code false} otherwise
     */
    public static boolean isPalindrome(LinkedList<String> list) {
        int first = 0;
        int last = list.size() - 1;

        while (first < last) {
            if (list.get(first).equals(list.get(last))) {
                first++;
                last--;
            } else {
                return false;
            }
        }
        return true;
    }
}