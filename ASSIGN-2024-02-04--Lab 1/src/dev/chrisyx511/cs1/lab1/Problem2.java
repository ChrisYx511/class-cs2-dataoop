package dev.chrisyx511.cs1.lab1;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        StudentRecord myRecord = new StudentRecord();
        myRecord.addQuizScore(7);
        myRecord.addQuizScore(9);
        myRecord.addQuizScore(10);

        myRecord.setMidtermScore(92);
        myRecord.setFinalExamScore(85);

        myRecord.calculateOverallAndLetterGrade();
        System.out.println("Final Score (non formatted): " + myRecord.getOverallScore());
        System.out.println("Final Score: " + new DecimalFormat("#.#").format(myRecord.getOverallScore()));
        System.out.println("Final Letter Grade: " + myRecord.getLetterGrade());

        System.out.println("\nMy Record: " + myRecord.toString());
        Test a = new Test(5);
        System.out.println(a.testBool());

    }
}

class Test {
    private static int test = 5;
    int test2;

    public boolean testBool() {
        return (test2 == test);
    }
    public Test(int val) {
        test2 = val;
    }
}