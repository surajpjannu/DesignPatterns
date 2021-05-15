package com.design.patterns.structural.decorator.concretecomponent;

import com.design.patterns.structural.decorator.component.Pizza;

public class PlainPizza implements Pizza {

    @Override
    public String printIngreedients() {
        return "Dough, cheese, flour, Olive oil, Basil";
    }

    @Override
    public double getCost() {
        return 100.00;
    }
}
