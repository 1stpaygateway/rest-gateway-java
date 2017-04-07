package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/17/2017.
 */
public class Void extends Operation {

    private String refNumber;

    Void(String merchantKey, String processorId) {
        super(merchantKey, processorId, "void");
    }

    Void() {
        super("void");
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
        setAttribute("refNumber", refNumber);
    }
}
