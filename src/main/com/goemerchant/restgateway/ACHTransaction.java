package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/16/2017.
 */
public abstract class ACHTransaction extends Transaction {

    ACHTransaction(String merchantKey, String processorId, String name) {
        super(merchantKey, processorId, name);
    }

    ACHTransaction(String name) {
        super(name);
    }

    public void setAba(String aba) {
        this.aba = aba;
        setAttribute("aba", aba);
    }

    public void setDda(String dda) {
        this.dda = dda;
        setAttribute("dda", dda);
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
        setAttribute("accountType", accountType);
    }

    public void setAchName(String achName) {
        this.achName = achName;
        setAttribute("achName", achName);
    }

    public void setCategoryText(String categoryText) {
        this.categoryText = categoryText;
        setAttribute("categoryText", categoryText);
    }
}
