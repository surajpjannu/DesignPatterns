package com.design.patterns.creational.singleton.valid3;

public enum Singleton {
    INSTANCE;

    public void printMessage(String objectName) {
        System.out.println(objectName + " hashcode is " + this.hashCode());
    }
}
