package com.design.patterns.behavioural.strategy;

import lombok.Data;

@Data
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        fly = new CanNotFly();
    }
}
