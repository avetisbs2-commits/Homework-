package CollectionsOperations;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 26. Ask the user to enter a sentence and store all unique words in a TreeSet<String>.
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        TreeSet<String> uniqueWords = getUniqueWords(sentence);
        System.out.println("Sorted unique words: " + uniqueWords);


        // 27. Given an array of integers, store them in a TreeSet<Integer>
        //     to automatically remove duplicates and sort the values.
        int[] numbers = {7, 3, 9, 1, 3, 7, 5};

        TreeSet<Integer> sortedNumbers = getSortedUnique(numbers);
        System.out.println("Sorted numbers: " + sortedNumbers);


        // 28. Use a TreeSet<Integer> to store a set of numbers and print only those within a specific range.
        TreeSet<Integer> range = new TreeSet<>();
        for (int i = 1; i <= 100; i++) {
            range.add(i);
        }

        System.out.println("Values between 25 and 50: " + range.subSet(25, 50));
    }

    // ===== 26 =====

    /**
     * Splits the given sentence into words and stores them in a TreeSet,
     * which automatically removes duplicates
     *
     * @param sentence the sentence to process
     * @return a TreeSet containing the unique words from the sentence, sorted alphabetically
     */
    public static TreeSet<String> getUniqueWords(String sentence) {
        TreeSet<String> words = new TreeSet<>();
        String[] splitWords = sentence.split(" ");

        for (String word : splitWords) {
            words.add(word);
        }
        return words;
    }

    // ===== 27 =====

    /**
     * Adds every element of the given array into a TreeSet, which
     * automatically removes duplicates
     *
     * @param numbers the array of integers to process
     * @return a TreeSet containing the unique values from the array, sorted ascending
     */
    public static TreeSet<Integer> getSortedUnique(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : numbers) {
            set.add(num);
        }
        return set;
    }
}