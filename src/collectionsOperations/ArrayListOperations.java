package collectionsOperations;

import java.util.*;

import static java.util.Collections.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 58, 0, 58, 75));


        // 1. Copy list values into another
        ArrayList<Integer> copy = new ArrayList<>(list);
        System.out.println("Copy " + copy);


        // 2. Reverse elements in a list
        ArrayList<Integer> reversed = new ArrayList<>(list);
        reverse(reversed);
        System.out.println("Reversed: " + reversed);


        // 3. Swap two elements in a list.
        ArrayList<Integer> swaped = new ArrayList<>(list);
        try {
            swap(swaped, 1, 2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Swaped: " + swaped);


        // 4. Iterate and print list elements
        System.out.print("Elements: ");
        for (int a : list) {
            System.out.print(a + " ");
        }
        System.out.println();


        // 5. Sort list elements
        ArrayList<Integer> sorted = new ArrayList<>(list);
        sort(sorted);
        System.out.println("Sorted: " + sorted);


        // 6. Remove duplicates.
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for (int i : list) {
            if ( ! noDuplicates.contains(i) ) {
                noDuplicates.add(i);
            }
        }
        System.out.println("NoDuplicates: " + noDuplicates);


        // 7. Find common elements
        ArrayList<Integer> otherList = new ArrayList<>(Arrays.asList(58, 15, 100, 0));
        ArrayList<Integer> common = new ArrayList<>(noDuplicates);
        common.retainAll(otherList);
        System.out.println("Common elements with " + otherList + ": " + common);


        // 8. Find the Largest Number
        System.out.println("The largest number: " + sorted.getLast());


        // 9. Combine Two lists
        ArrayList<Integer> combined = new ArrayList<>(list);
        combined.addAll(otherList);
        System.out.println("Combined : " + combined);


        // Sort the deduplicated list (used to correctly find the second-largest below)
        ArrayList<Integer> sortedNoDuplicates = new ArrayList<>(noDuplicates);
        sort(sortedNoDuplicates);
        System.out.println(sortedNoDuplicates);


        // 10. Find the Second-Largest Element
        System.out.println("The second largest number: " + sortedNoDuplicates.get(sortedNoDuplicates.size() - 2));
    }
}