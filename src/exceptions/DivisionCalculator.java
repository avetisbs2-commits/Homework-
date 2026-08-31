package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer");

        try {
            int n1 = scanner.nextInt();

            System.out.println("Enter second integer");
            int n2 = scanner.nextInt();

            double result = (double) n1 / n2;
            if(n2 == 0){
                throw new ArithmeticException();
            }

            System.out.println("The result is " + result);

        }catch (ArithmeticException e ){
            System.out.println("Error: Cannot divide by 0 ");

        }catch (InputMismatchException e){
            System.out.println("Error: Please enter only integer values");
        }

        scanner.close();
    }
}
