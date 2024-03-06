package dev.chrisyx511.cs2.labs.Lab7.Lab7Q8;

import java.util.InputMismatchException;
import java.util.Scanner;
import dev.chrisyx511.cs2.lecture.ExceptionHandling.DivisionByZeroException;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int n1, n2;
            double r;
            System.out.print("Numerator: ");
            n1 = scan.nextInt();
            System.out.print("Denominator: ");
            n2 = scan.nextInt();
            r = safeDivide(n1, n2);
            System.out.println("Answer: " + r);
        } catch (InputMismatchException e) {
            System.out.println("do you know what's a number-");
            main(new String[0]);
        } catch (DivisionByZeroException e) {
            System.out.println("Cannot Divide by 0! Try again!");
            main(new String[0]);
        }

    }

    public static double safeDivide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return (double) a / b;
    }

}
