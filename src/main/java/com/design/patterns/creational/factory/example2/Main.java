package com.design.patterns.creational.factory.example2;

public class Main {
    public static void main(String[] args) {
        TextParser textParser = new TextParser();
        textParser.parse();

        XMLParser xmlParser = new XMLParser();
        xmlParser.parse();
    }
}
