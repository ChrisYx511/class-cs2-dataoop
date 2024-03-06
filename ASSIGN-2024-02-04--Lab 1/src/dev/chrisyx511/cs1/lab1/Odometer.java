package dev.chrisyx511.cs1.lab1;

public class Odometer {
    private double milesDriven;
    private double fuelEfficiencyInMPG;

    public void resetOdometer() {
        milesDriven = 0.0;
    }

    public void setFuelEfficiencyInMPG(double fuelEfficiencyInMPG) {
        this.fuelEfficiencyInMPG = fuelEfficiencyInMPG;
    }

    public void addMilesDriven(double addedMiles) {
        this.milesDriven += addedMiles;
    }
    public double getTotalFuelConsumedInGal() {
        return milesDriven / fuelEfficiencyInMPG;
    }
    public Odometer(double fuelEfficiencyInMPG) {
        resetOdometer();
        setFuelEfficiencyInMPG(fuelEfficiencyInMPG);
    }
    public double getMilesDriven() {
        return milesDriven;
    }

    public double getFuelEfficiencyInMPG() {
        return fuelEfficiencyInMPG;
    }

    @Override
    public String toString() {
        return "Odometer{" +
                "milesDriven=" + milesDriven +
                ", fuelEfficiencyInMPG=" + fuelEfficiencyInMPG +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Odometer odometer = (Odometer) o;
        return Double.compare(milesDriven, odometer.milesDriven) == 0 && Double.compare(fuelEfficiencyInMPG, odometer.fuelEfficiencyInMPG) == 0;
    }


}
