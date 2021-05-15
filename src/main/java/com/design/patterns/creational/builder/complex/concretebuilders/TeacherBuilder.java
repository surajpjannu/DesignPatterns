package com.design.patterns.creational.builder.complex.concretebuilders;

import com.design.patterns.creational.builder.complex.IBuilder;
import com.design.patterns.creational.builder.complex.product.Teacher;

public class TeacherBuilder implements IBuilder {
    private String firstName;
    private String middleName;
    private String lastName;

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Teacher getResult() {
        Teacher data = new Teacher();
        data.setFirstName(firstName);
        data.setMiddleName(middleName);
        data.setLastName(lastName);
        return data;
    }
}
