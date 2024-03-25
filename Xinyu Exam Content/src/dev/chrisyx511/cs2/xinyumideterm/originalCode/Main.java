package dev.chrisyx511.cs2.xinyumideterm.originalCode;

import java.util.*;

interface Organize{
    String[] sort(String [] str);

}

interface Calculate{
    int calculate(int [] i);

}

class CompanyA implements Organize, Calculate{
    String [] name;
    int [] age;
    int [] salary;

    CompanyA(String [] name, int [] age, int [] salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int calculate(int[] salary) {
        int max = 0;
        for(int i = 1; i < salary.length; i++) {
            if (salary[i-1] < salary[i]) {
                max = i;
            }
        }return max;

    }

    @Override
    public String[] sort(String[] info) {
        for(int i = 1; i < info.length; i++) {
            String temp = "";
            if (info [i-1].charAt(1) > info [i].charAt(1)) {
                temp.equals(info[i-1]);
                info[i-1].equals(info[i]);
                info[i].equals(temp);
            }
        } return info;

    }

}

class CompanyB implements Organize, Calculate {
    String [] name;
    int [] age;
    int [] salary;

    CompanyB(String [] name, int [] age, int [] salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int calculate(int[] age) {
        int min = 0;
        for(int i = 1; i < age.length; i++) {
            if (age[i-1] > age[i]) {
                min = i;
            }
        }return min;

    }


    @Override
    public String[] sort(String[] str) {
        return str;
        // TODO Auto-generated method stub

    }

}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        ArrayList <String> NameA = new ArrayList <String>();
        ArrayList <Integer> AgeA = new ArrayList <Integer>();
        ArrayList <Integer> SalaryA = new ArrayList <Integer>();

        ArrayList <String> NameB = new ArrayList <String>();
        ArrayList <Integer> AgeB = new ArrayList <Integer>();
        ArrayList <Integer> SalaryB = new ArrayList <Integer>();

        System.out.println("Info for company A");
        while(flag) {
            System.out.println("Enter the name of the empolyee: ");
            NameA.add(in.next());
            System.out.println("Enter the age of the empolyee: ");
            AgeA.add(in.nextInt());
            System.out.println("Enter the salary of the empolyee: ");
            SalaryA.add(in.nextInt());
            System.out.println("Do you want to keep inputting? 1-> yes 2-> no");
            int select = in.nextInt();
            if (select == 2) flag = false;
        }
        flag = true;
        System.out.println("Info for company B");
        while(flag) {
            System.out.println("Enter the name of the empolyee: ");
            NameB.add(in.next());
            System.out.println("Enter the age of the empolyee: ");
            AgeB.add(in.nextInt());
            System.out.println("Enter the salary of the empolyee: ");
            SalaryB.add(in.nextInt());
            System.out.println("Do you want to keep inputting? 1-> yes 2-> no");
            int select = in.nextInt();
            if (select == 2) flag = false;
        }


        String nameA [] = new String [NameA.size()];
        int ageA [] = new int [AgeA.size()];
        int salaryA [] = new int [SalaryA.size()];
        String info [] = new String [NameA.size()];


        String nameB [] = new String [NameB.size()];
        int ageB [] = new int [AgeB.size()];
        int salaryB [] = new int [SalaryB.size()];


        //I forget how to convert array list to array.. but the sort method of a and calculate method should work if i have the info array


        CompanyA a = new CompanyA(nameA, ageA, salaryA);
        CompanyB b = new CompanyB(nameB, ageB, salaryB);


        System.out.println("info for company A\n--------------");
        System.out.println(nameA [a.calculate(salaryA)] + " has the highest salary.");
        System.out.println("Sorted list in ascending order based on name: ");
        for (int i = 0; i < info.length; i++) {
            System.out.print(a.sort(info)[i]);
        }


    }

}
