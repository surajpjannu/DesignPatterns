package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.product1.Button;
import com.design.patterns.creational.abstractfactory.product2.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
