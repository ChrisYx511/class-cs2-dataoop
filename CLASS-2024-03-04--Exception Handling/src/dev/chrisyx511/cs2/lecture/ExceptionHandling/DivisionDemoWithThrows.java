package dev.chrisyx511.cs2.lecture.ExceptionHandling;

import java.util.Scanner;

public class DivisionDemoWithThrows {

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter numerator:");
            int numerator = keyboard.nextInt();
            System.out.println("Enter denominator:");
            int denominator = keyboard.nextInt();

            double quotient = safeDivide(numerator, denominator);
            System.out.println(numerator + "/"
                    + denominator
                    + " = " + quotient);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
            secondChance();
        }

        System.out.println("End of program.");
    }

    public static double safeDivide(int numerator, int denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException();
        }
        return (double) numerator / denominator;
    }

    public static void secondChance() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Try again:");
        System.out.println("Enter numerator:");
        int numerator = keyboard.nextInt();
        System.out.println("Enter denominator:");
        System.out.println("Be sure the denominator is not zero.");
        int denominator = keyboard.nextInt();

        try {
            double quotient = safeDivide(numerator, denominator);
            System.out.println(numerator + "/"
                    + denominator
                    + " = " + quotient);
        } catch (DivisionByZeroException e) {
            System.out.println("I cannot do division by zero.");
            System.out.println("Aborting program.");
            System.exit(0);
        }

    }
}
