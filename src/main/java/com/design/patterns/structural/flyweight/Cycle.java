package com.design.patterns.structural.flyweight;

public class Cycle implements Vehicle {

    private String wheels; // intrinsic property which doesnot change
    private String color; // extrinsic property (Which can change)

    public Cycle() {
        this.wheels = "2";
        System.out.println("Cycle created");
    }

    @Override
    public void assignColor(String color) {
        this.color = color;
    }

    @Override
    public void startVehicle() {
        System.out.println("Cycle with color " + color + " and " + wheels + " wheels started");
    }

}
