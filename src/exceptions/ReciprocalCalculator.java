package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReciprocalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        try {

            int i = scanner.nextInt();

            if (i == 0) {
                throw new ArithmeticException();
            }

            double reciprocal = 1.0 / i;
            System.out.println("The reciprocal of " + i + " is " + reciprocal);

        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate reciprocal of 0");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integer values");
        }

        scanner.close();
    }
}
