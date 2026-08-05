package Exceptions;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            validateInput(input);

            String upper = toUpperCase(input);
            System.out.println("Uppercase: " + upper);

            String reversed = reverseString(input);
            System.out.println("Reversed: " + reversed);

            int vowelCount = countVowels(input);
            System.out.println("Vowel count: " + vowelCount);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Input string cannot be empty ");
        }

        scanner.close();
    }

    /**
     * Validates that the given string is not empty.
     * @param input the string to validate
     * @throws IllegalArgumentException if {@code input} is {@code null} or empty
     */
    static void validateInput(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Converts the given string to uppercase.
     * @param input the string to convert
     * @return the uppercase version of {@code input}
     */
    static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    /**
     * Reverses the given string.
     * @param input the string to reverse
     * @return a new string containing the characters of {@code input} in reverse order
     */
    static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Counts the number of vowels (a, e, i, o, u, case-insensitive) in the given string.
     * @param input the string to scan for vowels
     * @return the number of vowels found in {@code input}
     */
    static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}