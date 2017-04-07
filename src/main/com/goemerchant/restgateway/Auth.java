package com.goemerchant.restgateway;

import org.json.JSONException;
import org.json.JSONObject;

public class Auth extends CreditCardTransaction {

    /**
     * Default constructor for auth. Note that credentials are initially 'null' and must be set before calling create().
     */
    public Auth() {
        super("auth");
    }

    /**
     * Constructor with parameters for credentials.
     * @param merchantKey The merchant key (gateway ID) for this merchant account.
     * @param processorId The processor ID that represents the MID/TID combination used to process this Auth.
     */
    public Auth(String merchantKey, String processorId) {
        super(merchantKey, processorId, "auth");
    }
}