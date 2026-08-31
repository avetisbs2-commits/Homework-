package exceptions;

public class MyExceptionsExample {
    static void validate(int age, String lastName, String name)
            throws InvalidAgeException, InvalidNameException, InvalidLastNameException{

        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120, got: " + age);
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new InvalidLastNameException("Lastname cannot be empty");
        }
        if (name == null || name.isEmpty()) {
            throw new InvalidNameException("Name cannot be empty");
        }

        System.out.println("All values are valid!");
    }


public static void main(String[] args) {
    try {
        validate(10, "Smith", "");
    } catch (InvalidAgeException | InvalidLastNameException | InvalidNameException e) {
        System.out.println("Validation failed: " + e.getMessage());
    }
  }
}
