package com.design.patterns.behavioural.interpreter;

public class Gallons extends Expression {
    @Override
    public String gallons(double quantity) {
        return Double.toString(quantity);
    }

    @Override
    public String tableSpoons(double quantity) {
        return Double.toString(quantity * 256);
    }
}
