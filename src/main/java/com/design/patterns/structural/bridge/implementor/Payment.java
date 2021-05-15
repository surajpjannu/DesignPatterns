package com.design.patterns.structural.bridge.implementor;

import com.design.patterns.structural.bridge.abstraction.IPaymentSystem;

public abstract class Payment {
    protected IPaymentSystem ipymentSystem;

    public Payment(IPaymentSystem ipymentSystem) {
        this.ipymentSystem = ipymentSystem;
    }

    public abstract void makePayment();
}
