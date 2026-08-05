package Exceptions;

public class InvalidLastNameException extends RuntimeException {
    public InvalidLastNameException(String message) {
        super(message);
    }
}
