package dev.chrisyx511.cs2.lecture.ArrayList.Lab5Q4;

import java.util.Objects;

public class WayPoint {
    private double X;
    private double Y;
    private int T;

    public int getT() {
        return T;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setT(int t) {
        T = t;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "WayPoint{" +
                "X=" + X +
                ", Y=" + Y +
                ", T=" + T +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WayPoint wayPoint = (WayPoint) o;
        return Double.compare(X, wayPoint.X) == 0 && Double.compare(Y, wayPoint.Y) == 0 && Double.compare(T, wayPoint.T) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y, T);
    }

    public WayPoint() {
        this.setT(0);
        this.setX(0);
        this.setY(0);
    }

    public WayPoint(double x, double y, int t) {
        this.setX(x);
        this.setY(y);
        this.setT(t);
    }

    public WayPoint(WayPoint other) {
        this.setX(other.getX());
        this.setY(other.getY());
        this.setT(other.getT());
    }
}
