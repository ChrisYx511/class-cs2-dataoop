package dev.chrisyx511.cs2.Assignment1.Q1;

// -------------------------------------------------------
// Assignment 1
// Written by: Xi Yang - 2358310
// For “Data Structures and OOP” Section 01 – Winter 2024
// --------------------------------------------------------

import java.util.Arrays;

/**
 * Class that extends <code>Property</code>, defining a Condo
 */
public class Condo extends Property {
    // Base Prices in an array where the index is (zoneCode - 1)
    final static int[] basePrices = new int[]{300000, 200000, 100000};

    public Condo() {
        super();
    }

    public Condo(String address, int zoneCode, int numOfBedrooms, int yearOfConstruction, double riskFactor) {
        super(address, zoneCode, numOfBedrooms, yearOfConstruction, riskFactor);
    }

    public Condo(Condo a) {
        super(a);
    }

    @Override
    public double evaluatePrice() {
        System.out.println(basePrices[getZoneCode() - 1]);
        return basePrices[getZoneCode() - 1] + (0.05 * basePrices[getZoneCode() - 1] * getNumOfBedrooms()) + (double) (getYearOfConstruction() * 100) / 2;
    }

    @Override
    public String toString() {
        return "Condo{" +
                "address='" + this.getAddress() + '\'' +
                ", zoneCode=" + this.getZoneCode() +
                ", numOfBedrooms=" + this.getNumOfBedrooms() +
                ", yearOfConstruction=" + this.getYearOfConstruction() +
                ", riskFactor=" + this.getRiskFactor() +
                ", basePrices=" + Arrays.toString(basePrices) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Condo property = (Condo) o;
        return getZoneCode() == property.getZoneCode() && getNumOfBedrooms() == property.getNumOfBedrooms() && getYearOfConstruction() == property.getYearOfConstruction() && getRiskFactor() == property.getRiskFactor() && getAddress().equals(property.getAddress());
    }
}
