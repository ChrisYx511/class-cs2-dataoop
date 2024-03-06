package dev.chrisyx511.cs2.lecture.ClassParams;

public class ReferenceDetails {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value);
        int result = byValue(value);
        // Notice that it is A COPY OF THE VALUE that is passed to the method, not the actual variable
        // Therefore, value doesn't change
        System.out.println(value);
    }

    static int byValue(int a) {
        a += 2;
        return a;
    }

}
