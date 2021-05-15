package com.design.patterns.structural.proxy;

public class DatabaseProxy extends DatabaseImpl {

    boolean isadmin;

    public DatabaseProxy(boolean isAdmin) {
        this.isadmin = isAdmin;
    }

    @Override
    public void delete() {
        if (isadmin) {
            super.delete();
        } else {
            System.out.println("Idiot you dont have Delete access");
        }
    }
}
