package com.design.patterns.structural.bridge;

import com.design.patterns.structural.bridge.abstraction.IPaymentSystem;
import com.design.patterns.structural.bridge.concreteimplementor.NetbankingPayment;
import com.design.patterns.structural.bridge.implementor.Payment;
import com.design.patterns.structural.bridge.concreteimplementor.CardPayment;
import com.design.patterns.structural.bridge.refinedabstraction.CitiPaymentSystem;
import com.design.patterns.structural.bridge.refinedabstraction.HdfcPaymentSystem;

public class Main {
    public static void main(String[] args) {
        IPaymentSystem paymentSystem1 = new CitiPaymentSystem();
        Payment payment = new CardPayment(paymentSystem1);
        payment.makePayment();

        IPaymentSystem paymentSystem2 = new HdfcPaymentSystem();
        Payment payment2 = new NetbankingPayment(paymentSystem2);
        payment2.makePayment();
    }
}
