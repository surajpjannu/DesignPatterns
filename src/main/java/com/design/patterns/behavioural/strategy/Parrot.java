package com.design.patterns.behavioural.strategy;

import lombok.Data;

@Data
public class Parrot extends Animal {

    public Parrot(String name) {
        super(name);

        fly = new CanFly();
    }
}
