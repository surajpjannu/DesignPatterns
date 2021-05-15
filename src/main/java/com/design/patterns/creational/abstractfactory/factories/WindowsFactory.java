package com.design.patterns.creational.abstractfactory.factories;

import com.design.patterns.creational.abstractfactory.GUIFactory;
import com.design.patterns.creational.abstractfactory.product1.Button;
import com.design.patterns.creational.abstractfactory.product1.WindowsButton;
import com.design.patterns.creational.abstractfactory.product2.Checkbox;
import com.design.patterns.creational.abstractfactory.product2.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}