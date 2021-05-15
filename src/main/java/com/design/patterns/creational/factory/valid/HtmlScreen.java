package com.design.patterns.creational.factory.valid;

public class HtmlScreen extends Screen {
    @Override
    protected TextView createTextView() {
        return new HtmlTextView();
    }
}
