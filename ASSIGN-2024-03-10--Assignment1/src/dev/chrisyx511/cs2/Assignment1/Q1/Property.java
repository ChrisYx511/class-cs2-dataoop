package dev.chrisyx511.cs2.Assignment1.Q1;

// -------------------------------------------------------
// Assignment 1
// Written by: Xi Yang - 2358310
// For “Data Structures and OOP” Section 01 – Winter 2024
// --------------------------------------------------------

/**
 * Abstract class defining a general property
 */
public abstract class Property {
    private String address;
    private int zoneCode;
    private int numOfBedrooms;
    private int yearOfConstruction;
    private double riskFactor;

    // Constructors
    public Property() {
        setAddress("Unknown Address");
        setNumOfBedrooms(3);
        setYearOfConstruction(2024);
        setZoneCode(1);
        setRiskFactor(0.5);
    }

    public Property(String address, int zoneCode, int numOfBedrooms, int yearOfConstruction, double riskFactor) {
        setAddress(address);
        setNumOfBedrooms(numOfBedrooms);
        setZoneCode(zoneCode);
        setYearOfConstruction(yearOfConstruction);
        setRiskFactor(riskFactor);
    }

    public Property(Property a) {
        this.setAddress(a.getAddress());
        this.setRiskFactor(a.getRiskFactor());
        this.setZoneCode(a.getZoneCode());
        this.setNumOfBedrooms(a.getNumOfBedrooms());
        this.setYearOfConstruction(a.getYearOfConstruction());
    }

    // Getters
    public double getRiskFactor() {
        return riskFactor;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public int getZoneCode() {
        return zoneCode;
    }

    public String getAddress() {
        return address;
    }
    // Setters

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public void setRiskFactor(double riskFactor) {
        if (riskFactor > 1.0 || riskFactor < 0.0) {
            System.out.println("ERROR: Invalid Risk Factor! Exiting...");
            System.exit(1);
        }
        this.riskFactor = riskFactor;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public void setZoneCode(int zoneCode) {
        if (zoneCode > 3 || zoneCode < 1) {
            System.out.println("ERROR: Invalid Zone Code! Exiting...");
            System.exit(1);
        }
        this.zoneCode = zoneCode;

    }
    // Equals and toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return getZoneCode() == property.getZoneCode() && getNumOfBedrooms() == property.getNumOfBedrooms() && getYearOfConstruction() == property.getYearOfConstruction() && getRiskFactor() == property.getRiskFactor() && getAddress().equals(property.getAddress());
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", zoneCode=" + zoneCode +
                ", numOfBedrooms=" + numOfBedrooms +
                ", yearOfConstruction=" + yearOfConstruction +
                ", riskFactor=" + riskFactor +
                '}';
    }

    // evaluatePrice and analyzeInvestment blocks
    public abstract double evaluatePrice();

    public double analyzeInvestment() {
        return getRiskFactor() * 50;
    }

}
