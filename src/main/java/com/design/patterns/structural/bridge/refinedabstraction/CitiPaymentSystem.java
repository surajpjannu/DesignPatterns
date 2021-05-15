package com.design.patterns.structural.bridge.refinedabstraction;

import com.design.patterns.structural.bridge.abstraction.IPaymentSystem;

public class CitiPaymentSystem implements IPaymentSystem {
    @Override
    public void processPayment(String paymentSystem) {
        System.out.println("Using CITI bank payment gateway for " + paymentSystem);
    }
}
