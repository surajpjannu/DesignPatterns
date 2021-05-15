package com.design.patterns.structural.decorator.decorator;

import com.design.patterns.structural.decorator.component.Pizza;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String printIngreedients() {
        return pizza.printIngreedients();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
