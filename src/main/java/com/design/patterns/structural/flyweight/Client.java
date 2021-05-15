package com.design.patterns.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        Vehicle car1 = VehicleFactory.getVehicle("car");
        car1.assignColor("black");
        car1.startVehicle();

        Vehicle car2 = VehicleFactory.getVehicle("car");
        car2.assignColor("red");
        car2.startVehicle();


        Vehicle cycle1 = VehicleFactory.getVehicle("cycle");
        cycle1.assignColor("black");
        cycle1.startVehicle();

        Vehicle cycle2 = VehicleFactory.getVehicle("cycle");
        cycle2.assignColor("red");
        cycle2.startVehicle();
    }
}
