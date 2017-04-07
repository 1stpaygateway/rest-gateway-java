package com.goemerchant.restgateway;

/**
 * The Retail Stand Alone Credit operation allows the merchant to credit a transaction that has NOT been previously run
 * through the gateway.
 * Created by kevin.demoura on 2/13/2017.
 */
public class StandAloneCredit extends CreditCardTransaction {
    StandAloneCredit(String merchantKey, String processorId) {
        super(merchantKey, processorId, "creditRetailOnly");
    }

    StandAloneCredit() {
        super("creditRetailOnly");
    }
}