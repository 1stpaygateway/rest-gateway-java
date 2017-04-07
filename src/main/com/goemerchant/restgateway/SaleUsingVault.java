package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/31/2017.
 */
public class SaleUsingVault extends VaultTransaction {
    SaleUsingVault(String merchantKey, String processorId) {
        super(merchantKey, processorId, "SaleUsingVault");
    }

    SaleUsingVault() {
        super("SaleUsingVault");
    }


}
