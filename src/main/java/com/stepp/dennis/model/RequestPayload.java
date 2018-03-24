package com.stepp.dennis.model;

import com.stepp.dennis.model.account.CustomerAccount;
import com.stepp.dennis.model.authorization.AuthorizationTransaction;
import com.stepp.dennis.model.creditcard.CreditCard;
import com.stepp.dennis.model.request.AuthorizationRequest;

public interface RequestPayload {
    AuthorizationRequest create(CustomerAccount CustomerAccount, CreditCard CreditCard, AuthorizationTransaction AuthTrxn);
}
