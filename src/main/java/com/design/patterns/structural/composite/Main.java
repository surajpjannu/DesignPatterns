package com.design.patterns.structural.composite;

import com.design.patterns.structural.composite.composite.Manager;
import com.design.patterns.structural.composite.leaf.Employee;

public class Main {
    public static void main(String[] args) {
        Employee suraj = new Employee("suraj","est");
        Employee manju = new Employee("manju","est");
        Employee anju = new Employee("anju","est");
        Employee vinu = new Employee("vinu","est");
        Employee guru = new Employee("guru","est");

        Manager amit = new Manager("amit","est");
        amit.addAssociate(suraj);
        amit.addAssociate(manju);
        amit.addAssociate(anju);
        amit.addAssociate(vinu);
        amit.addAssociate(guru);

        Manager ashu = new Manager("ashu","est");
        ashu.addAssociate(amit);


        ashu.getDetails();
    }
}
