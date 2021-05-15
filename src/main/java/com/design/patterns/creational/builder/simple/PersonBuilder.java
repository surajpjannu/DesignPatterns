package com.design.patterns.creational.builder.simple;

public class PersonBuilder {

    private String firstName;
    private String middleName;
    private String lastName;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public Person build() {
        final Person person = new Person();
        person.setFirstName(this.firstName);
        person.setLastName(this.lastName);
        person.setMiddleName(this.middleName);
        return person;
    }
}