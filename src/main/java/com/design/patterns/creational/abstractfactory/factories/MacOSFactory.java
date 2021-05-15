package com.design.patterns.creational.abstractfactory.factories;

import com.design.patterns.creational.abstractfactory.GUIFactory;
import com.design.patterns.creational.abstractfactory.product1.Button;
import com.design.patterns.creational.abstractfactory.product1.MacOSButton;
import com.design.patterns.creational.abstractfactory.product2.Checkbox;
import com.design.patterns.creational.abstractfactory.product2.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}