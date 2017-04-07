package com.goemerchant.restgateway;

/**
 * Created by kevin.demoura on 1/26/2017.
 */
public class RecurringOperation extends Operation {

    // recurring
    String recurring;
    String recurringStartDate;
    String recurringEndDate;

    RecurringOperation(String merchantKey, String processorId, String name) {
        super(merchantKey, processorId, name);
    }

    RecurringOperation(String name) {
        super(name);
    }

    public void setRecurring(String recurring) {
        this.recurring = recurring;
        setAttribute("recurring", recurring);
    }

    public void setRecurringStartDate(String recurringStartDate) {
        this.recurringStartDate = recurringStartDate;
        setAttribute("recurringStartDate", recurringStartDate);
    }

    public void setRecurringEndDate(String recurringEndDate) {
        this.recurringEndDate = recurringEndDate;
        setAttribute("recurringEndDate", recurringEndDate);
    }


}
