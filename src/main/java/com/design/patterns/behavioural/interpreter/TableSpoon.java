package com.design.patterns.behavioural.interpreter;

public class TableSpoon extends Expression {
    @Override
    public String gallons(double quantity) {
        return Double.toString(quantity / 256);
    }

    @Override
    public String tableSpoons(double quantity) {
        return Double.toString(quantity);
    }
}
