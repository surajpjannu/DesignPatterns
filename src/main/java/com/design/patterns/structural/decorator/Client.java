package com.design.patterns.structural.decorator;

import com.design.patterns.structural.decorator.concretecomponent.PlainPizza;
import com.design.patterns.structural.decorator.concretedecorator.MozzarellaTopping;
import com.design.patterns.structural.decorator.concretedecorator.TomotoSauceTopping;

public class Client {
    public static void main(String[] args) {
        PlainPizza plainPizza = new PlainPizza();
        MozzarellaTopping mozzarellaTopping = new MozzarellaTopping(plainPizza);
        TomotoSauceTopping tomotoSauceTopping = new TomotoSauceTopping(mozzarellaTopping);

        System.out.println("Cost : " + tomotoSauceTopping.getCost());
        System.out.println("ingredients : " + tomotoSauceTopping.printIngreedients());
    }
}
