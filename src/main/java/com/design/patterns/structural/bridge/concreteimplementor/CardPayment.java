package com.design.patterns.structural.bridge.concreteimplementor;

import com.design.patterns.structural.bridge.abstraction.IPaymentSystem;
import com.design.patterns.structural.bridge.implementor.Payment;

public class CardPayment extends Payment {

    public CardPayment(IPaymentSystem ipymentSystem) {
        super(ipymentSystem);
    }

    @Override
    public void makePayment() {
        ipymentSystem.processPayment("Card payment");
    }
}
