package com.design.patterns.behavioural.chainofresponsibility.concretehandler;

public abstract class AbstractLogger {

    protected AbstractLogger abstractLogger;

    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;

    public int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public abstract void logMessage(int level, String message);

    public void setNextLogger(AbstractLogger abstractLogger){
        this.abstractLogger = abstractLogger;
    }
}
