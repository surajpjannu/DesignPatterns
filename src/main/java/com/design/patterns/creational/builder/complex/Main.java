package com.design.patterns.creational.builder.complex;

import com.design.patterns.creational.builder.complex.concretebuilders.DriverBuilder;
import com.design.patterns.creational.builder.complex.concretebuilders.ITEmployeeBuilder;
import com.design.patterns.creational.builder.complex.concretebuilders.TeacherBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ITEmployeeBuilder itEmployeeBuilder = new ITEmployeeBuilder();
        DriverBuilder driverBuilder = new DriverBuilder();
        TeacherBuilder teacherBuilder = new TeacherBuilder();

        director.construct(itEmployeeBuilder);
        director.construct(driverBuilder);
        director.construct(teacherBuilder);

        System.out.println(itEmployeeBuilder.getResult());
        System.out.println(driverBuilder.getResult());
        System.out.println(teacherBuilder.getResult());
    }


}
