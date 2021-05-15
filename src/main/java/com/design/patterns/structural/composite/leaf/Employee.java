package com.design.patterns.structural.composite.leaf;

import com.design.patterns.structural.composite.component.IEmployee;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee implements IEmployee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void getDetails() {
        System.out.println("Name : " + name + " department : " + department);
    }
}
