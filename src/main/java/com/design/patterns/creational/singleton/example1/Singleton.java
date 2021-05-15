package com.design.patterns.creational.singleton.example1;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    /*
     * This class implements a marker interface called Serializable for the purpose of serialization and deserialization
     * */

    /*
     * static member to hold the instance of the class
     *
     * lazy : if you want to create instance only when its requested for the firsttime
     * eager : create instance before someone requests (Not a best option, so demonstarting lazy method)
     * */
    private static Singleton singleton = null;

    /*
     * private constructor to prevent anybody from outside to instantiate the Singleton class
     * */
    private Singleton() {
        System.out.println("new instance created");
    }

    /*
     *  Global point of access to the singleton object
     *
     *  static cos it can be accessed via classname instead of object
     * */
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void printMessage(String objectName) {
        System.out.println(objectName + " hashcode is " + this.hashCode());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
