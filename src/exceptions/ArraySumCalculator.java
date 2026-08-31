package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int sum = 0;

        try {

            int size = scanner.nextInt();
            int[] numbers = new int[size];

            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter integer #" + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
                sum += numbers[i];
            }

            System.out.println("The sum of the array elements is: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integer values");
        }

        scanner.close();
    }
}
