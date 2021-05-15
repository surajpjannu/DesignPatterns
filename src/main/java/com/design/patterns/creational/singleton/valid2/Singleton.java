package com.design.patterns.creational.singleton.valid2;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * Example 3 is a valid design for Singleton
 * But we can still improve something wrt multithreading scenarios
 * */
public class Singleton implements Serializable, Cloneable {
    /*
     * This class implements a marker interface called Serializable for the purpose of serialization and deserialization
     * */

    static class Holder{
       static final Singleton INSTANCE = new Singleton();
    }

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
        return  Holder.INSTANCE;
    }

    public void printMessage(String objectName) {
        System.out.println(objectName + " hashcode is " + this.hashCode());
    }

    /*
     * throw exception if anyone trys to clone it.
     * */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    /*
     * Just to avoid new object creation via serialization and deserialization implement a method readResolve and
     * return the instance
     * */
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}
