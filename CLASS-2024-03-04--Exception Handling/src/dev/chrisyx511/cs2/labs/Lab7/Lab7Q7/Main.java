package dev.chrisyx511.cs2.labs.Lab7.Lab7Q7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 0;
        try {
            System.out.print("Enter Number of Numbers to enter: ");
            N = getPositiveIntFromUser();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += handleNumberEntry(i + 1);
            }
            System.out.println("Average: " + ((double) sum / N));
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            main(new String[]{});
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + ", Try Again!");
            main(new String[0]);

        }
    }

    public static int getPositiveIntFromUser() throws NegativeNumberException {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num < 0) {
            throw new NegativeNumberException();
        }
        return num;
    }

    public static int handleNumberEntry(int n) {
        int num = 0;
        try {
            System.out.print("Enter number " + n + ": ");
            num = getPositiveIntFromUser();
        } catch (NegativeNumberException e) {
            System.out.println("Try again! Number cannot be negative");
            handleNumberEntry(n);
        }
        return num;
    }

}
