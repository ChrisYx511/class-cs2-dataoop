package dev.chrisyx511.cs2.labs.Lab6.Q2;

public class Main {
    public static void main(String[] args) {
        final int n = 5;
        int[][] square = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = 0;
            }
        }
        int y = n - 1;
        int x = n / 2;
        int num = 1;
        int i = y;
        int j = x;
        while (num <= n * n) {
            if (!checkRowExists(i, square)) {
                i = 0;
                continue;
            }
            if (!checkColExists(i, j, square)) {
                j = 0;
                continue;
            }
            if (checkIfNumFilled(i, j, square)) {
                i -= 2;
                j -=1;
                continue;
            }
            square[i][j] = num;
            i++;
            j++;
            num++;
            System.out.println(num);
        }


    }

    public static boolean checkRowExists(int i, int[][] arr) {
        return arr.length - 1 >= i;
    }

    public static boolean checkColExists(int i, int j, int[][] arr) {
        return arr[i].length - 1 >= j;
    }

    public static boolean checkIfNumFilled(int i, int j, int[][] arr) {
        return arr[i][j] != 0;
    }
}
