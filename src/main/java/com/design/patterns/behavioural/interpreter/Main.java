package com.design.patterns.behavioural.interpreter;

public class Main {
    public static void main(String[] args) {
        // 1
        String context1 = "1 gallons to tablespoon";
        ConversionContext conversionContext1 = new ConversionContext(context1);
        System.out.println(conversionContext1.getConversionResponse());
        // 2
        String context2 = "256 tablespoon to gallons";
        ConversionContext conversionContext2 = new ConversionContext(context2);
        System.out.println(conversionContext2.getConversionResponse());
    }



}
