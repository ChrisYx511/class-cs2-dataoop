package dev.chrisyx511.cs2.labs.Lab5;

public class Lab5Q1 {
    public static void main(String[] args) {
        new Array();
    }

}

class Array {
    Array() {
        String[] ary = new String[6];
        load(ary);
        dump(ary);
    }

    void dump(String[] ary) {
        for (int n = 0; n < ary.length; n++)
            System.out.println(ary[n]);
        System.out.println();
    }

    void load(String[] ary) {
        for (int n = 1; n < ary.length; n += 2) {
            ary[n - 1] = " Pos: " + n;
            ary[n] = " Neg: " + (-n - 1);
        }
    }
}