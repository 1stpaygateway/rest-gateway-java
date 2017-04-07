package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/18/2017.
 */
public class Credit extends RecurringOperation {
    Credit(String merchantKey, String processorId) {
        super(merchantKey, processorId, "credit");
    }

    Credit() {
        super("credit");
    }

    public void setTransactionAmount(String amount) {
        setAttribute("transactionAmount", amount);
    }

    public void setRefNumber(String refNumber) {
        setAttribute("refNumber", refNumber);
    }

}
