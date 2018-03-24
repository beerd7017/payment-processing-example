package com.stepp.dennis.model.request;

import com.stepp.dennis.model.account.CustomerAccount;
import com.stepp.dennis.model.authorization.AuthorizationTransaction;
import com.stepp.dennis.model.creditcard.CreditCard;

public class AuthorizationRequest {
    CustomerAccount customerAccount;

    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    public AuthorizationTransaction getAuthTrxn() {
        return authTrxn;
    }

    public void setAuthTrxn(AuthorizationTransaction authTrxn) {
        this.authTrxn = authTrxn;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    AuthorizationTransaction authTrxn;
    CreditCard creditCard;
}
