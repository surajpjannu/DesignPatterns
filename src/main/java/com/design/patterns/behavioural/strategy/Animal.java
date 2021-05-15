package com.design.patterns.behavioural.strategy;

import lombok.Data;

@Data
public class Animal {

    protected String name;
    protected Fly fly;

    public Animal(String name) {
        this.name = name;
    }

    public void iAm() {
        System.out.println("I am " + name);
    }

    public void tryToFly() {
        fly.fly(name);
    }
}
