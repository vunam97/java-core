package entity;

public class InvalidAgeInputingException extends RuntimeException{
    public InvalidAgeInputingException() {
        super();
    }

    public InvalidAgeInputingException(String message) {
        super(message);
    }
}
