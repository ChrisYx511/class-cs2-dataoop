package dev.chrisyx511.cs2.Assignment1.Q2;

// -------------------------------------------------------
// Assignment 1
// Written by: Xi Yang - 2358310
// For “Data Structures and OOP” Section 01 – Winter 2024
// --------------------------------------------------------

public class MainQ2 {
    public static void main(String[] args) {
        System.out.println("**** Welcome to ABC Group Analyzer System **** \n");

        // Array of car VFCV values
        final int[] VFCV={8,12,13,15,15,15,10,9,9,10,25,18,7,6,5,10,24,10,11,12};
        // Array counting the numbers of vehicles belonging to each
        // VFCV, using an index offset from 5 to 25 (0=5, 1=6, etc.)
        int[] numberForEachVFCV = {
                0, 0, 0, 0, 0,
                0, 0, 0, 0, 0,
                0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0
        };
        // Each time a certain VFCV is encountered, add 1 to the index of that VFCV in the previous array
        for (int VFCVNum : VFCV) {
            numberForEachVFCV[VFCVNum - 5]++;
        }
        // Execute each method to get the respective value
        getEachVFCV(numberForEachVFCV);
        getAboveVFCV(numberForEachVFCV);
        maxNumVehiclesVFCV(numberForEachVFCV);
        highestVFCVnoVehicle(numberForEachVFCV);

        System.out.println("\n***** Thanks for using VFCV Analyser *****");
    }

    /**
     * Method to get the amount of cars that have each VFCV
     * @param numberForEachVFCV an array containing popularity for each VFCV, where the index is a VFCV value offset from 5
     */
    public static void getEachVFCV(int[] numberForEachVFCV) {
        System.out.println("The number of vehicles with ");
        int lineSkipCounter = 0;
        for (int i = 0; i < numberForEachVFCV.length; i++) {
            System.out.print("VFCV " + (i + 5) + " is " + numberForEachVFCV[i]);
            if (lineSkipCounter >= 2) {
                System.out.println();
                lineSkipCounter = 0;
            } else {
                System.out.print("        ");
                lineSkipCounter++;
            }
        }
        System.out.println("\n \n");
    }
    /**
     * Method to get the amount of cars that are above each VFCV level
     * @param numberForEachVFCV an array containing popularity for each VFCV, where the index is a VFCV value offset from 5
     */
    public static void getAboveVFCV(int[] numberForEachVFCV) {
        System.out.println("The number of vehicles with VFCV ");
        int lineSkipCounter = 0;
        for (int i = 0; i < numberForEachVFCV.length - 1; i++) {
            int sumAbove = 0;
            // Sum all the vehicle counts with larger VFCVs, since the array is already ordered by VFCV
            for (int j = i + 1; j < numberForEachVFCV.length; j++) {
                sumAbove += numberForEachVFCV[j];
            }
            System.out.print("Above " + (i + 5) + " is " + sumAbove);
            if (lineSkipCounter >= 2) {
                System.out.println();
                lineSkipCounter = 0;
            } else {
                System.out.print("        ");
                lineSkipCounter++;
            }
        }
        System.out.print("Above 25 is 0");
        System.out.println("\n \n");

    }
    /**
     * Method to get the VFCV value which is the most common in the cars given
     * @param numberForEachVFCV an array containing popularity for each VFCV, where the index is a VFCV value offset from 5
     */
    public static void maxNumVehiclesVFCV(int[] numberForEachVFCV) {
        int largestIndex = 0;
        int largestNumber = 0;
        // Whenever a larger VFCV is encountered, set the number to a larger value and the corresponding index
        for (int i = 0; i < numberForEachVFCV.length; i++) {
            if (numberForEachVFCV[i] > largestNumber) {
                largestNumber = numberForEachVFCV[i];
                largestIndex = i;
            }
        }
        System.out.println("The VFCV collected by the maximum number of vehicles is : " + (largestIndex + 5));

    }
    /**
     * Method to get the highest VFCV value which no vehicles correspond to, or output No VFCV value is unused
     * @param numberForEachVFCV an array containing popularity for each VFCV, where the index is a VFCV value offset from 5
     */
    public static void highestVFCVnoVehicle(int[] numberForEachVFCV) {
        // Since the index cannot be equal to 22, if it stays 22 it means there are no empty VFCVs
        int largestIndex =  22;
        for (int i = 0; i < numberForEachVFCV.length; i++) {
            if (numberForEachVFCV[i] == 0) {
                largestIndex = i;
            }
        }
        if (largestIndex == 22) {
            System.out.println("No VFCV value is unused!");
        } else {
            System.out.println("The highest VFCV which belongs to no vehicle is " + (largestIndex + 5));
        }
    }
}
