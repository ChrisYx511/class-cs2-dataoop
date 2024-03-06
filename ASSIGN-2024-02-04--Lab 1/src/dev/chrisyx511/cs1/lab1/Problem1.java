package dev.chrisyx511.cs1.lab1;

import java.text.DecimalFormat;
public class Problem1 {
    public static void main(String[] args) {
        Odometer trip1 = new Odometer(4.5);
        trip1.addMilesDriven(500);
        System.out.println("Trip 1 miles driven so far: " + trip1.getMilesDriven() + " miles");
        trip1.addMilesDriven(157);
        System.out.println("Trip 1 miles driven so far: " + trip1.getMilesDriven() + " miles");
        System.out.println("Trip 1 fuel efficiency: " + trip1.getFuelEfficiencyInMPG() + " mpg");
        System.out.println("Trip 1 fuel consumed: " + new DecimalFormat("#.##").format(trip1.getTotalFuelConsumedInGal()) + " gal");
        Odometer trip2 = new Odometer(5.2);
        trip2.addMilesDriven(234);
        System.out.println("Trip 2 miles driven so far: " + trip2.getMilesDriven() + " miles");
        trip2.resetOdometer();
        System.out.println("Trip 2 miles driven after reset: " + trip2.getMilesDriven() + " miles");
        trip2.addMilesDriven(343);
        System.out.println("Trip 2 miles driven so far: " + trip2.getMilesDriven() + " miles");
        System.out.println("Trip 2 fuel efficiency: " + trip2.getFuelEfficiencyInMPG() + " mpg");
        System.out.println("Trip 2 fuel consumed: " + new DecimalFormat("#.##").format(trip2.getTotalFuelConsumedInGal()) + " gal");

        System.out.println("\nTrip 1: " + trip1);
        System.out.println("Trip 2: " + trip2);
    }
}
