package com.design.patterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("dog");
        dog.iAm();
        dog.tryToFly();

        Animal bird = new Parrot("bird");
        bird.iAm();
        bird.tryToFly();

        dog.setFly(new CanFly());
        dog.tryToFly();
    }
}
