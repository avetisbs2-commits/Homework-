package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try{
            int age = scanner.nextInt();
            if (age < 0 || age > 120){
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException | InputMismatchException e){
            System.out.print("Error: Invalid age");
        }

        scanner.close();
    }
}
