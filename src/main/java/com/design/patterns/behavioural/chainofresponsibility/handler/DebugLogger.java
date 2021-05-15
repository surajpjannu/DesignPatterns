package com.design.patterns.behavioural.chainofresponsibility.handler;

import com.design.patterns.behavioural.chainofresponsibility.concretehandler.AbstractLogger;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        super(level);
    }

    @Override
    public void logMessage(int level, String message) {
        if (this.level == level) {
            System.out.println("DEBUG : " + message);
        } else {
            abstractLogger.logMessage(level, message);
        }
    }
}
