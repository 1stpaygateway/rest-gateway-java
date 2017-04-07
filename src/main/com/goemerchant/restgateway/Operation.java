/**
 * Highest-level abstraction of a gateway operation.
 * @author Kevin DeMoura (demourak)
 * @version 1.0
 */
package com.goemerchant.restgateway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class Operation {

    // credentials for account
    private String merchantKey;
    private String processorId;

    private JSONObject requestJSON;

    private String name; // endpoint name ('auth' for /auth, etc) see support.goemerchant.com/gateway for full list

    private String response; // http response
    private int httpStatus; // code

    private static final String apiUrlProduction = "https://secure.goemerchant.com/secure/RestGW/Gateway/Transaction/";
    private static final String apiUrlValidation = "https://secure-v.goemerchant.com/secure/RestGW/Gateway/Transaction/";
    private String apiUrl = apiUrlProduction; // default to production POST TO URL.

    Operation(String merchantKey, String processorId, String name) {
        requestJSON = new JSONObject();
        this.name = name;
        setMerchantKey(merchantKey);
        setProcessorId(processorId);
    }

    /**
     *
     * @param name The REST endpoint this operation applies to.
     */
    Operation(String name) {
        requestJSON = new JSONObject();
        this.name = name;
    }

    /**
     * Forms and sends an HTTP POST request using this operation's current requestJSON.
     * @return String The HTTP response.
     */
    public String create() {
        HttpURLConnection conn = null;
        String strUrl = apiUrl + name;
        BufferedReader in = null;
        StringBuffer buffer;
        try {
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);
            conn.setDoInput(true);

            // send the request
            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
            out.write(this.getRequest());
            out.flush();
            out.close();

            System.out.println("Request sent.");

            this.httpStatus = conn.getResponseCode();

            // read response
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            System.out.println("Input stream received.");

        } catch (IOException e) {
            in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            e.printStackTrace();
            System.out.println("Error stream received.");
        } finally {
            String line;
            buffer = new StringBuffer();
            try {
                while ((line = in.readLine()) != null) {
                    buffer.append(line);
                }
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.response = buffer.toString();
        return response;
    }

    public void setMerchantKey(String merchantKey) {
        this.merchantKey = merchantKey;
        setAttribute("merchantKey", merchantKey);
    }

    public void setProcessorId(String processorId) {
        this.processorId = processorId;
        setAttribute("processorId", processorId);
    }

    /**
     * Set this operation to submit to the validation environment (for sandbox testing).
     * @param validation True only if this operation should point to the validation environment.
     */
    public void setValidation(boolean validation) {
        if (validation) {
            apiUrl = apiUrlValidation;
        }
        else {
            apiUrl = apiUrlProduction;
        }
    }

    public String getRequest() {
        return requestJSON.toString();
    }

    /**
     *
     * @return
     */
    public JSONObject getRequestJSON() {
        return requestJSON;
    }

    /**
     *
     * @return The HTTP status code. 0 if create() has not been called.
     */
    public int getHttpStatus() {
        return httpStatus;
    }

    public void setAttribute(String key, String value) {
        try {
            requestJSON.put(key, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setAttribute(String key, Boolean value) {
        try {
            requestJSON.put(key, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * The JSONObject response.
     * @return The http response as a JSONObject, or null if there is no response or if the response cannot be parsed
     * as JSON. Use getResponse() for the response as a normal String.
     */
    public JSONObject getResponseJSON() {
        JSONObject json = null;
        try {
            json = new JSONObject(this.response);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        return json;
    }

    /**
     * The HTTP response from this operation. Also returned as the result of create().
     * @return The HTTP response as a String, or null if there is no response.
     */
    public String getResponse() {
        return this.response;
    }
}