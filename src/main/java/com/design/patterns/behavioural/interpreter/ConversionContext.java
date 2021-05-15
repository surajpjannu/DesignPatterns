package com.design.patterns.behavioural.interpreter;

import lombok.Data;

@Data
public class ConversionContext {

    private String conversionQuestion;

    private String conversionResponse;

    private String fromConversion;

    private String toConversion;

    private String[] partsOfQuestion;

    private double quantity;

    public ConversionContext(String context) {
        conversionQuestion = context;

        partsOfQuestion = context.split(" ");

        fromConversion = partsOfQuestion[1];
        toConversion = partsOfQuestion[3];

        quantity = Double.valueOf(partsOfQuestion[0]);
        conversionResponse = partsOfQuestion[0] + " " + fromConversion + " equals ";
    }

    public String getConversionResponse() {
        return conversionResponse + getExpressionValue();
    }

    private String getExpressionValue() {
        if (fromConversion.equalsIgnoreCase("gallons")) {
            return new Gallons().tableSpoons(quantity);
        }
        return new TableSpoon().gallons(quantity);
    }
}
