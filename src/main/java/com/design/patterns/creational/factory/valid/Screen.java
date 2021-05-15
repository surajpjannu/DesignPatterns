package com.design.patterns.creational.factory.valid;

public abstract class Screen {

    public void displayScreen() {
        TextView textView = createTextView();
        textView.display();
    }

    protected abstract TextView createTextView();

}
