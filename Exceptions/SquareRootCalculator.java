package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRootCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int n = scanner.nextInt();

            if (n < 0){
                throw new IllegalArgumentException();
            }

            System.out.println("The square root of " + n + " is " + Math.sqrt(n));

        }catch (IllegalArgumentException | InputMismatchException e){
            System.out.println("Invalid number");
        }finally {
            System.out.println("Good bye");
        }

        scanner.close();
    }
}
