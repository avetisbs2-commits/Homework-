package collectionsOperations;

import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        // 24. Given an array of integers, remove all duplicates using a HashSet<Integer>.
        int[] input = {3, 5, 2, 3, 7, 5, 2};
        HashSet<Integer> set = new HashSet<>();

        for (int num : input) {
            set.add(num);
        }

        System.out.println(set);


        // 25. Compare two lists of numbers and print the common elements using HashSet.
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        HashSet<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);

        System.out.println("Common elements: " + result);
    }
}