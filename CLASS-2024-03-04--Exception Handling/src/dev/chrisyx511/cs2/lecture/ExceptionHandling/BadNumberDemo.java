package dev.chrisyx511.cs2.lecture.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BadNumberDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one of the numbers 42 and 24: ");
        try {
            int num = in.nextInt();
            if (num != 42 && num != 24) {
                throw new BadNumberException(num);
            }
            System.out.println("OK!");
        } catch (BadNumberException e) {
            System.out.println(e.getBadNumber() + " is not what I asked for.");
        } catch (InputMismatchException e) {  // Multiple Catch blocks are possible
            System.out.println("Wrong input try again!");
            main(new String[]{});
        } catch (Exception e) { // From most specific to most general
            System.out.println(e.getMessage());
        }

    }
}
