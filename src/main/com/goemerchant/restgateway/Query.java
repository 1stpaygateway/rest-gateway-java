package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/17/2017.
 */
public class Query extends Operation {
    Query(String merchantKey, String processorId) {
        super(merchantKey, processorId, "query");
    }

    Query() {
        super("query");
    }
}
