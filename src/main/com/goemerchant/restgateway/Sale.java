package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/17/2017.
 */
public class Sale extends CreditCardTransaction {
    Sale(String merchantKey, String processorId) {
        super(merchantKey, processorId, "sale");
    }

    Sale() {
        super("sale");
    }
}
