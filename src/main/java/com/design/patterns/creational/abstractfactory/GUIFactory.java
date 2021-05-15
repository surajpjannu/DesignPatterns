package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.product1.Button;
import com.design.patterns.creational.abstractfactory.product2.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}