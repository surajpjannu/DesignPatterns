package com.design.patterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        runOperation(true);
        System.out.println("===========");
        runOperation(false);

    }

    private static void runOperation(boolean isAdmin) {
        DatabaseProxy databaseProxy = new DatabaseProxy(isAdmin);
        databaseProxy.create();
        databaseProxy.update();
        databaseProxy.read();
        databaseProxy.delete();
    }
}
