package dev.chrisyx511.cs2.labs.Lab7.Lab7Q7;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Number cannot be negative!");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
