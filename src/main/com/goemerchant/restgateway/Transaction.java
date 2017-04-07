package com.goemerchant.restgateway;

/**
 *
 * Created by jc.castano on 8/26/15.
 *
 * Contributors: kevin.demoura
 *
 */

public abstract class Transaction extends RecurringOperation {

    // credit card
    String cardNumber;
    String cardExpMonth;
    String cardExpYear;
    String cVV;
    String cardType;
    String creditCardToken;
    String creditCardCryptogram;
    Boolean preventPartial;

    // card present (retail)
    String magData;
    String ksn;
    String encryptionBlockType;

    // ACH fields
    String aba;
    String accountType;
    String achName;
    String categoryText;
    String dda;

    String closeDate;

    String id;
    String vaultKey;
    String vaultId;

    String ipAddress;

    String tipAmount;
    String transactionAmount;

    // billing address info
    String ownerCity;
    String ownerCountry;
    String ownerEmail;
    String ownerName;
    String ownerPhone;
    String ownerState;
    String ownerStreet;
    String ownerStreet2;
    String ownerZip;

    Boolean autoGenerateOrderId;
    Boolean orderIdIsUnique;
    String  orderId;

    // for Settle
    Boolean isAdjustment;

    // Level 2
    String  customerRefNo;
    Boolean localTaxFlag;
    Boolean purchaseCard;
    String  taxAmount;
    String shippingZip;

    Transaction(String merchantKey, String processorId, String name) {
        super(merchantKey, processorId, name);
    }

    Transaction(String name) {
        super(name);
    }

    public void setAutoGenerateOrderId(Boolean autoGenerateOrderId) {
        this.autoGenerateOrderId = autoGenerateOrderId;
        setAttribute("autoGenerateOrderId", autoGenerateOrderId);
    }

    public void setOrderIdIsUnique(Boolean orderIdIsUnique) {
        this.orderIdIsUnique = orderIdIsUnique;
        setAttribute("orderIdIsUnique", orderIdIsUnique);
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
        setAttribute("orderId", orderId);
    }

    protected void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
        setAttribute("closeDate", closeDate);
    }

    protected void setId(String id) {
        this.id = id;
        setAttribute("id", id);
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        setAttribute("ipAddress", ipAddress);
    }
}