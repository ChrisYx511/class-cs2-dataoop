package dev.chrisyx511.cs2.Assignment1.Q1;

// -------------------------------------------------------
// Assignment 1
// Written by: Xi Yang - 2358310
// For “Data Structures and OOP” Section 01 – Winter 2024
// --------------------------------------------------------

public class MainQ1 {
    public static void main(String[] args) {
        // Declare test values for array of Condo and SFHome
        final Property[] arr = new Property[]{
                new Condo("7 Main St.", 1, 2, 2012, 0.1),
                new Condo("20 Square St.", 2, 1, 2020, 0.02),
                new SFHome("65 rue College", 3, 3, 1988, 0.2),
                new SFHome("110 Flowers rd.", 1, 4, 1992, 0.15)
        };
        System.out.println("**** Welcome to ABC Analyzer ****");
        // Loop through each item of property array, and outputting depending on if it is a Condo or a SFHome
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Condo condo) {
                System.out.println("Property " + (i + 1) + ": ");
                System.out.println("Type: Condo");
                displayPropertyInfo(condo.getAddress(), condo.getZoneCode(), condo.getNumOfBedrooms(),
                        condo.getYearOfConstruction(), condo.getRiskFactor(),
                        condo.analyzeInvestment(), condo.evaluatePrice());
            } else if (arr[i] instanceof SFHome sfHome) {
                System.out.println("Property " + (i + 1) + ": ");
                System.out.println("Type: Single-Family Home");
                displayPropertyInfo(sfHome.getAddress(), sfHome.getZoneCode(),
                        sfHome.getNumOfBedrooms(), sfHome.getYearOfConstruction(),
                        sfHome.getRiskFactor(), sfHome.analyzeInvestment(),
                        sfHome.evaluatePrice());
            }
        }
        System.out.println("**** Thank you for using ABC Analyzer! ****");

    }

    /**
     * Output a formatted version of all the information within a given property
     * @param address Address property
     * @param zoneCode zoneCode property
     * @param numOfBedrooms numOfBedrooms property
     * @param yearOfConstruction yearOfConstruction property
     * @param riskFactor riskFactor property
     * @param investmentAnalysis result from investment analysis
     * @param evalPrice result from evaluated price
     */
    private static void displayPropertyInfo(
            String address, int zoneCode, int numOfBedrooms,
            int yearOfConstruction, double riskFactor,
            double investmentAnalysis, double evalPrice
    )
    {
        System.out.println("Address: " + address);
        System.out.println("Zone: " + zoneCode);
        System.out.println("No. of Bedrooms: " + numOfBedrooms);
        System.out.println("Year of Construction: " + yearOfConstruction);
        System.out.println("R Factor: " + riskFactor);
        System.out.println();
        System.out.println("Investment Analysis: " + investmentAnalysis);
        System.out.println("Evaluated Price: $" + evalPrice);
        System.out.println("======================");
    }
}
