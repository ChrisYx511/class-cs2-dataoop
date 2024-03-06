package dev.chrisyx511.cs2.lecture.Inheritance;

public class Example1 {
    public static void main(String[] args) {
        Car prius = new Car("Toyota", "Prius");
        prius.setBrand("Toyota");
        prius.setModel("Prius");
        System.out.println(prius.getBrand());
        System.out.println(prius.getModel());

    }
}
// This is our base class
class Vehicle {
    private String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
// This is a class that EXTENDS the base Vehicle Class
class Car extends Vehicle {
    private String model;
    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}