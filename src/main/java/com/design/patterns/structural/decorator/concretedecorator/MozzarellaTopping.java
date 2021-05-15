package com.design.patterns.structural.decorator.concretedecorator;

import com.design.patterns.structural.decorator.component.Pizza;
import com.design.patterns.structural.decorator.decorator.ToppingDecorator;

public class MozzarellaTopping extends ToppingDecorator {

    public MozzarellaTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }

    @Override
    public String printIngreedients() {
        return super.printIngreedients() + ", Mozzarella";
    }
}
