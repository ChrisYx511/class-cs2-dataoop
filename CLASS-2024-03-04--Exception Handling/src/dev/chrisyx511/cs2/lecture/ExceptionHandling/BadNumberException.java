package dev.chrisyx511.cs2.lecture.ExceptionHandling;

public class BadNumberException extends Exception {
    private final int badNumber;

    public BadNumberException() {
        super("ERROR: Bad Number");
        badNumber = 0;
    }

    public BadNumberException(int num) {
        super("ERROR: Bad Number");
        badNumber = num;
    }

    public int getBadNumber() {
        return badNumber;
    }
}
