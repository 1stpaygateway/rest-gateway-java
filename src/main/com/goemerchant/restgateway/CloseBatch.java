package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 2/13/2017.
 */
public class CloseBatch extends Operation {

    private String fromEmail;
    private String successEmail;
    private String failureEmail;

    CloseBatch(String merchantKey, String processorId) {
        super(merchantKey, processorId, "closeBatch");
    }

    CloseBatch() {
        super("closeBatch");
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
        setAttribute("fromEmail", fromEmail);
    }


    public void setSuccessEmail(String successEmail) {
        this.successEmail = successEmail;
        setAttribute("successEmail", successEmail);
    }

    public void setFailureEmail(String failureEmail) {
        this.failureEmail = failureEmail;
        setAttribute("failureEmail", failureEmail);
    }
}
