package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/27/2017.
 */
public class Settle extends Operation {
    Settle(String merchantKey, String processorId) {
        super(merchantKey, processorId, "settle");
    }

    Settle() {
        super("settle");
    }

    public void setIsAdjustment(Boolean isAdjustment) {
        setAttribute("isAdjustment", isAdjustment);
    }

    public void setRefNumber(String refNumber) {
        setAttribute("refNumber", refNumber);
    }

    public void setTransactionAmount(String amount) {
        setAttribute("transactionAmount", amount);
    }
}
