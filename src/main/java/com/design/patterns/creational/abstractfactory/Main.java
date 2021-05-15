package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.factories.MacOSFactory;
import com.design.patterns.creational.abstractfactory.factories.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        new Application(new WindowsFactory()).paint();

        new Application(new MacOSFactory()).paint();
    }
}
