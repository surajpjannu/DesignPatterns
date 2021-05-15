package com.design.patterns.creational.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        Parser xml = SimpleFactory.getParser("xml");
        xml.parse();

        Parser text = SimpleFactory.getParser("text");
        text.parse();

        Parser csv = SimpleFactory.getParser("csv");
        csv.parse();

    }
}
