package com.design.patterns.structural.composite.composite;

import com.design.patterns.structural.composite.component.IEmployee;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IEmployee {

    private List<IEmployee> iEmployees;

    private String name;
    private String department;

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
        iEmployees = new ArrayList<>();
    }

    public void addAssociate(IEmployee employee){
        iEmployees.add(employee);
    }

    @Override
    public void getDetails() {
        System.out.println("Manager Name : " + name + " department : " + department);
        iEmployees.forEach(IEmployee::getDetails);
    }
}
