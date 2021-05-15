package com.design.patterns.creational.factory.simplefactory;

public class SimpleFactory {

    /*
    * Suppose consider you have a 100 different Parsers
    * and customer has to remember the object creation of all 100 Parsers
    * So create a method to create the object and return the object to caller based on some condition
    * */
    public static Parser getParser(String parser) {
        if (parser.equals("text")) {
            return new TextParser();
        }
        if (parser.equals("xml")) {
            return new XMLParser();
        }
        if (parser.equals("csv")) {
            return new CSVParser();
        }
        return null;
    }
}
