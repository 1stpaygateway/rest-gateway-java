package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/31/2017.
 */
public class VaultTransaction extends StandAloneTransaction{
    VaultTransaction(String merchantKey, String processorId, String name) {
        super(merchantKey, processorId, name);
    }

    VaultTransaction(String name) {
        super(name);
    }

    public void setVaultKey(String vaultKey) {
        this.vaultKey = vaultKey;
        setAttribute("vaultKey", vaultKey);
    }

    public void setVaultId(String vaultId) {
        setAttribute("vaultId", vaultId);
    }
}
