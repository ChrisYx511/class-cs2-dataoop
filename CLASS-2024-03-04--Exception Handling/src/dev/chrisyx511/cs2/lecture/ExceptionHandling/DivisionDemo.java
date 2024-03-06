package dev.chrisyx511.cs2.lecture.ExceptionHandling;

public class DivisionDemo {
    public static void main(String[] args) {
        double a = 5;
        double b = 0;
        try {
            if (b == 0) {
                throw new DivisionByZeroException();
            }
            System.out.println(a / b);
        } catch (DivisionByZeroException err) {
            System.out.println(err.getMessage());
        }

    }
}
