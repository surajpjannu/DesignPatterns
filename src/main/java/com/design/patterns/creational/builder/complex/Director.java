package com.design.patterns.creational.builder.complex;

public class Director {

    public void construct(IBuilder builder) {
        builder.setFirstName("Suraj");
        builder.setLastName("jannu");
        builder.setMiddleName("Pandiuranga");
    }

}
