package dev.chrisyx511.cs2.lecture.ArrayList.Lab5Q4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<WayPoint> wayPoints = new ArrayList<WayPoint>();
    private static double totalDistance = 0;
    private static double totalSpeed = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a new coordinate (n) or quit (q)? ");
        String menuOption = in.nextLine();
        if (menuOption.equalsIgnoreCase("q")) {
            System.exit(0);
        }
        if (!menuOption.equalsIgnoreCase("n")) {
            System.out.println("Invalid Choice! Exiting...");
            System.exit(1);
        }
        System.out.println("WayPoint Entry: ");
        System.out.print("X: ");
        double X = in.nextDouble();
        System.out.print("Y: ");
        double Y = in.nextDouble();
        System.out.print("T: ");
        int T = in.nextInt();
        WayPoint currentWayPoint = new WayPoint(X, Y, T);
        wayPoints.addLast(currentWayPoint);
        if (wayPoints.size() < 2) {
            System.out.println("First WayPoint added!");
            main(new String[0]);
        }
        WayPoint lastWayPoint = wayPoints.get(wayPoints.size() - 2);
        totalDistance += getDistance(lastWayPoint, currentWayPoint);
        totalSpeed += getSpeed(lastWayPoint, currentWayPoint);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + (totalSpeed / (wayPoints.size() - 1)) + " mph");
        main(new String[0]);
    }

    private static double getDistance(WayPoint point1, WayPoint point2) {
        return Math.sqrt((Math.pow((point2.getX() - point1.getX()), 2) + Math.pow((point2.getY() - point1.getY()), 2))) * 0.1;
    }

    private static double getSpeed(WayPoint point1, WayPoint point2) {
        double deltaT = (double) (point2.getT() - point1.getT()) / 3600;
        return getDistance(point1, point2) / deltaT;
    }

}
