package com.design.patterns.creational.singleton.valid1;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * Example 2 is a valid design for Singleton
 * But we can still improve something wrt multithreading scenarios
 * */
public class Singleton implements Serializable, Cloneable {
    /*
     * This class implements a marker interface called Serializable for the purpose of serialization and deserialization
     * */

    /*
     * static member to hold the instance of the class
     * volatile cos in theory double check lock can be broken so avoid that we are using volatile
     *
     * lazy : if you want to create instance only when its requested for the firsttime
     * eager : create instance before someone requests (Not a best option, so demonstarting lazy method)
     * */
    private static volatile Singleton singleton = null;

    private static boolean created = false;

    /*
     * private constructor to prevent anybody from outside to instantiate the Singleton class
     * */
    private Singleton() {
        /*
         * Inorder to stop object creation via reflection you can check if the instance is null or not.
         * if not throw an exception
         * */
        if (singleton != null) {
            throw new RuntimeException("use getInstance() method");
        }
        System.out.println("new instance created");

        /*
         * Suppose consider a situation where object is created via reflection first and then someone trys to use via
         *  getInstance method.
         * To stop such behaviour we can have a boolean flag to check
         * */
        created = true;
    }

    /*
     *  Global point of access to the singleton object
     *
     *  static cos it can be accessed via classname instead of object
     * */
    public static Singleton getInstance() {
        /*
         * Suppose consider a situation where object is created via reflection first and then someone trys to use via
         *  getInstance method.
         * To stop such behaviour we can have a boolean flag to check
         * */
        if (created && singleton == null) {
            throw new RuntimeException("Always use getInstance() method for creating object");
        }
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {    // Double check (volatile) Half initilized objects
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
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
