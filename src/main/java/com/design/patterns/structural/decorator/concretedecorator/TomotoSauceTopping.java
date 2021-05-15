package com.design.patterns.structural.decorator.concretedecorator;

import com.design.patterns.structural.decorator.component.Pizza;
import com.design.patterns.structural.decorator.decorator.ToppingDecorator;

public class TomotoSauceTopping extends ToppingDecorator {

    public TomotoSauceTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 6;
    }

    @Override
    public String printIngreedients() {
        return super.printIngreedients() + ", Tomoto sauce";
    }
}
