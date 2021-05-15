package com.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static final Map<String, Vehicle> vehicleList = new HashMap<>();

    public static Vehicle getVehicle(String type) {
        if (vehicleList.get(type) != null) {
            return vehicleList.get(type);
        }

        Vehicle vehicle = null;
        switch (type) {
            case "car":
                vehicle = new Car();
                break;
            case "cycle":
                vehicle = new Cycle();
                break;
        }
        if (vehicle != null) {
            vehicleList.put(type, vehicle);
        }
        return vehicle;
    }
}
