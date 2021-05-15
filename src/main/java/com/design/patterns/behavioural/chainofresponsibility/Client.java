package com.design.patterns.behavioural.chainofresponsibility;

import com.design.patterns.behavioural.chainofresponsibility.concretehandler.AbstractLogger;
import com.design.patterns.behavioural.chainofresponsibility.handler.DebugLogger;
import com.design.patterns.behavioural.chainofresponsibility.handler.ErrorLogger;
import com.design.patterns.behavioural.chainofresponsibility.handler.InfoLogger;

public class Client {
    public static void main(String[] args) {
        AbstractLogger abstractLogger = getAbstractLogger();

        abstractLogger.logMessage(AbstractLogger.DEBUG, "this is debug log");
        abstractLogger.logMessage(AbstractLogger.INFO, "this is info log");
        abstractLogger.logMessage(AbstractLogger.ERROR, "this is error log");
    }

    private static AbstractLogger getAbstractLogger() {
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);
        return debugLogger;
    }
}
