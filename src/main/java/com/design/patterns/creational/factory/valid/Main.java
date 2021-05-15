package com.design.patterns.creational.factory.valid;

public class Main {
    public static void main(String[] args) {
        /*
        * you can create a simplefactory for this if you want
        * */
        Screen screen = new HtmlScreen();
        screen.displayScreen();

        Screen screen1 = new WindowsScreen();
        screen1.displayScreen();

    }
}
