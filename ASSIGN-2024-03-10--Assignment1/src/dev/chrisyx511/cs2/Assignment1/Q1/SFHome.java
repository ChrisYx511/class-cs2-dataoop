package dev.chrisyx511.cs2.Assignment1.Q1;

// -------------------------------------------------------
// Assignment 1
// Written by: Xi Yang - 2358310
// For “Data Structures and OOP” Section 01 – Winter 2024
// --------------------------------------------------------
import java.util.Arrays;
/**
 * Class that extends <code>Property</code>, defining a SFHome
 */
public class SFHome extends Property {
    static final private int[] basePrices = new int[]{500000, 400000, 300000};
    public SFHome() {
        super();
    }

    public SFHome(String address, int zoneCode, int numOfBedrooms, int yearOfConstruction, double riskFactor) {
        super(address, zoneCode, numOfBedrooms, yearOfConstruction, riskFactor);
    }

    public SFHome(SFHome a) {
        super(a);
    }

    @Override
    public double evaluatePrice() {
        System.out.println(basePrices[getZoneCode()-1]);
        return basePrices[getZoneCode() - 1] + (0.05 * basePrices[getZoneCode() - 1] * getNumOfBedrooms()) + (double) (getYearOfConstruction() * 100) / 2;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SFHome property = (SFHome) o;
        return getZoneCode() == property.getZoneCode() && getNumOfBedrooms() == property.getNumOfBedrooms() && getYearOfConstruction() == property.getYearOfConstruction() && getRiskFactor() == property.getRiskFactor() && getAddress().equals(property.getAddress());
    }

    @Override
    public String toString() {
        return "SFHome{" +
                "address='" + getAddress() + '\'' +
                ", zoneCode=" + getZoneCode() +
                ", numOfBedrooms=" + getNumOfBedrooms() +
                ", yearOfConstruction=" + getYearOfConstruction() +
                ", riskFactor=" + getRiskFactor() +
                ", basePrices=" + Arrays.toString(basePrices) +
                '}';
    }

}
