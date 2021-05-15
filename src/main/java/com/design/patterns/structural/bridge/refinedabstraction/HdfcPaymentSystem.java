package com.design.patterns.structural.bridge.refinedabstraction;

import com.design.patterns.structural.bridge.abstraction.IPaymentSystem;

public class HdfcPaymentSystem implements IPaymentSystem {
    @Override
    public void processPayment(String paymentSystem) {
        System.out.println("Using HDFC bank payment gateway for " + paymentSystem);
    }
}
