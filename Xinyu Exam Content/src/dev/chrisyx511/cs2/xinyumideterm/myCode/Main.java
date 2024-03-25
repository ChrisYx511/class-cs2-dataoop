package dev.chrisyx511.cs2.xinyumideterm.myCode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Chris", "Bob", "Albert"};
        int[] salaries = {3000, 1000, 2000};
        int[] age = {30, 10, 20};
        CompanyA companyA = new CompanyA();
        System.out.println(Arrays.toString(companyA.sort(companyA.names)));
    }
}

interface Organize {
    String[] sort(String[] names);
}

interface Calculate {
    int calculate(int[] arr);
}

class CompanyA implements Organize, Calculate {
    String[] names = {"Chris", "Bob", "Albert"};
    int[] salaries = {3000, 1000, 2000};
    int[] ages = {30, 10, 20};

    @Override
    public String toString() {
        return "dev.chrisyx511.cs2.xinyumideterm.myCode.CompanyA{" +
                "names=" + Arrays.toString(names) +
                ", salaries=" + Arrays.toString(salaries) +
                ", ages=" + Arrays.toString(ages) +
                '}';
    }
    @Override
    public String[] sort(String[] names) {
        for (int j = 0; j < names.length; j++) {
            for (int i = 1; i < names.length; i++) {
                String temp = "";
                if (names[i - 1].charAt(0) > names[i].charAt(0)) {
                    temp = names[i - 1];
                    names[i - 1] = names[i];
                    names[i] = temp;
                }
            }
        }

        return names;
    }
    @Override
            public int calculate(int[] arr) {

                return 3;
        }


    }

