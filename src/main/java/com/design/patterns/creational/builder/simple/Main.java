package com.design.patterns.creational.builder.simple;

public class Main {
    public static void main(String[] args) {
        final Person person = new Person();
        person.setFirstName("Suraj");
        person.setLastName("Jannu");
        person.setMiddleName("Panduranga");

        System.out.println(person);

        Person build = new PersonBuilder().setFirstName("suraj")
                                          .setLastName("jannu")
                                          .setMiddleName("Panduranga")
                                          .build();
        System.out.println(build);
    }
}
