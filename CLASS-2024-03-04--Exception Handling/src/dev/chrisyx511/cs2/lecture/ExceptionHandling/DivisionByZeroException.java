package dev.chrisyx511.cs2.lecture.ExceptionHandling;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("ERROR: Divide by Zero");
    }

    public DivisionByZeroException(String string) {
        super(string);
    }
}
