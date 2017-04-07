package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/27/2017.
 */
public class ReAuth extends ReTransaction {
    ReAuth(String merchantKey, String processorId) {
        super(merchantKey, processorId, "reauth");
    }

    ReAuth() {
        super("reauth");
    }
}
