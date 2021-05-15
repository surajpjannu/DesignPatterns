package com.design.patterns.structural.bridge.concreteimplementor;

import com.design.patterns.structural.bridge.abstraction.IPaymentSystem;
import com.design.patterns.structural.bridge.implementor.Payment;

public class NetbankingPayment extends Payment {
    public NetbankingPayment(IPaymentSystem ipymentSystem) {
        super(ipymentSystem);
    }

    @Override
    public void makePayment() {
        ipymentSystem.processPayment("Netbanking payment");
    }
}

