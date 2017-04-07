package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/18/2017.
 */
public abstract class StandAloneTransaction extends Transaction {
    StandAloneTransaction(String merchantKey, String processorId, String name) {
        super(merchantKey, processorId, name);
    }

    StandAloneTransaction(String name) {
        super(name);
    }

    // *** Billing information *** //
    public void setOwnerCity(String ownerCity) {
        this.ownerCity = ownerCity;
        setAttribute("ownerCity", ownerCity);
    }

    public void setOwnerCountry(String ownerCountry) {
        this.ownerCountry = ownerCountry;
        setAttribute("ownerCountry", ownerCountry);
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
        setAttribute("ownerEmail", ownerEmail);
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        setAttribute("ownerName", ownerName);
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public void setOwnerState(String ownerState) {
        this.ownerState = ownerState;
        setAttribute("ownerState", ownerState);
    }

    public void setOwnerStreet(String ownerStreet) {
        this.ownerStreet = ownerStreet;
        setAttribute("ownerStreet", ownerStreet);
    }

    public void setOwnerStreet2(String ownerStreet2) {
        this.ownerStreet2 = ownerStreet2;
        setAttribute("ownerStreet2", ownerStreet2);
    }

    public void setOwnerZip(String ownerZip) {
        this.ownerZip = ownerZip;
        setAttribute("ownerZip", ownerZip);
    }

    // *** Transaction Amount information *** //
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
        setAttribute("transactionAmount", transactionAmount);
    }

    // *** Level 2 Attributes *** //
    public void setCustomerRefNo(String customerRefNo) {
        this.customerRefNo = customerRefNo;
        setAttribute("customerRefNo", customerRefNo);
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
        setAttribute("taxAmount", taxAmount);
    }

    public void setLocalTaxFlag(Boolean localTaxFlag) {
        this.localTaxFlag = localTaxFlag;
        setAttribute("localTaxFlag", localTaxFlag);
    }

    public void setPurchaseCard(Boolean purchaseCard) {
        this.purchaseCard = purchaseCard;
        setAttribute("purchaseCard", purchaseCard);
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
        setAttribute("shippingZip", shippingZip);
    }

}
