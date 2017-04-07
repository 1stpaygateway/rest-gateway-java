package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/16/2017.
 */
public abstract class CreditCardTransaction extends StandAloneTransaction {

    CreditCardTransaction(String merchantKey, String processorId, String name) {
        super(merchantKey, processorId, name);
    }

    CreditCardTransaction(String name) {
        super(name);
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        setAttribute("cardNumber", cardNumber);
    }

    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
        setAttribute("cardExpMonth", cardExpMonth);
    }

    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
        setAttribute("cardExpYear", cardExpYear);
    }

    public void setcVV(String cVV) {
        this.cVV = cVV;
        setAttribute("cVV", cVV);
    }

    public void setCreditCardToken(String creditCardToken) {
        this.creditCardToken = creditCardToken;
        setAttribute("creditCardToken", creditCardToken);
    }

    public void setCreditCardCryptogram(String creditCardCryptogram) {
        this.creditCardCryptogram = creditCardCryptogram;
        setAttribute("creditCardCryptogram", creditCardCryptogram);
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
        setAttribute("cardType", cardType);
    }

    public void setMagData(String magData) {
        this.magData = magData;
        setAttribute("magData", magData);
    }

    public void setKsn(String ksn) {
        this.ksn = ksn;
        setAttribute("ksn", ksn);
    }

    public void setEncryptionBlockType(String encryptionBlockType) {
        this.encryptionBlockType = encryptionBlockType;
        setAttribute("encryptionBlockType", encryptionBlockType);
    }

    public void setPreventPartial(Boolean preventPartial) {
        this.preventPartial = preventPartial;
        setAttribute("preventPartial", preventPartial);
    }

    protected void setTipAmount(String tipAmount) {
        this.tipAmount = tipAmount;
        setAttribute("tipAmount", tipAmount);
    }
}
