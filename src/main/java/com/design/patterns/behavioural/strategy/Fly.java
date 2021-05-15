package com.design.patterns.behavioural.strategy;

public interface Fly {
    void fly(String name);
}

class CanFly implements Fly {

    @Override
    public void fly(String name) {
        System.out.println(name + " can fly");
    }
}

class CanNotFly implements Fly {

    @Override
    public void fly(String name) {
        System.out.println(name + " cannot fly");
    }
}
