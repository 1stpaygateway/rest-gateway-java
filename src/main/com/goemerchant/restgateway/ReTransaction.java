package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/26/2017.
 */
public class ReTransaction extends Transaction {
    ReTransaction(String merchantKey, String processorId, String name) {
        super(merchantKey, processorId, name);
    }

    ReTransaction(String name) {
        super(name);
    }

    public void setRefNumber(String refNumber) {
        setAttribute("refNumber", refNumber);
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
        setAttribute("transactionAmount", transactionAmount);
    }
}
