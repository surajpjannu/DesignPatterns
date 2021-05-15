package com.design.patterns.structural.proxy;

public class DatabaseImpl implements IDatabase {
    @Override
    public void create() {
        System.out.println("created");
    }

    @Override
    public void update() {
        System.out.println("updated");
    }

    @Override
    public void read() {
        System.out.println("read");
    }

    @Override
    public void delete() {
        System.out.println("deleted");
    }
}
