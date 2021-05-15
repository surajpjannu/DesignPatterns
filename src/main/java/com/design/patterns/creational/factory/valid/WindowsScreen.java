package com.design.patterns.creational.factory.valid;

public class WindowsScreen extends Screen {
    @Override
    protected TextView createTextView() {
        return new WindowsTextView();
    }
}
