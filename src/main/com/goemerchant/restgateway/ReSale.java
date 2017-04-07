package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/27/2017.
 */
public class ReSale extends ReTransaction {
    ReSale(String merchantKey, String processorId) {
        super(merchantKey, processorId, "resale");
    }

    ReSale() {
        super("resale");
    }
}
