package com.design.patterns.structural.flyweight;

public class Car implements Vehicle {

    private String wheels; // intrinsic property which doesnot change
    private String color; // extrinsic property (Which can change)

    public Car() {
        this.wheels = "4";
        System.out.println("Car created");
    }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startVehicle() {
        System.out.println("Car with color " + color + " and " + wheels + " wheels started");
    }

}
