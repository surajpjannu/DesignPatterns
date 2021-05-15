package com.design.patterns.behavioural.chainofresponsibility.handler;

import com.design.patterns.behavioural.chainofresponsibility.concretehandler.AbstractLogger;

public class InfoLogger  extends AbstractLogger {

    public InfoLogger(int level) {
        super(level);
    }

    @Override
    public void logMessage(int level, String message) {
        if (this.level == level) {
            System.out.println("INFO : " + message);
        }else {
            abstractLogger.logMessage(level,message);
        }
    }
}
