package com.stepp.dennis.model.authorization;

import com.stepp.dennis.model.TransactionType;

public class AuthorizationFactory implements TransactionType {
    AuthorizationTransaction authTrxn = new AuthorizationTransaction();

    @Override
    public AuthorizationTransaction create(String TransactionKey, String RefId, String TransactionType, String Amount, String CurrencyCode) {
        authTrxn.setTransactionKey(TransactionKey);
        authTrxn.setRefId(RefId);
        authTrxn.setTransactionType(TransactionType);
        authTrxn.setAmount(Amount);
        authTrxn.setCurrencyCode(CurrencyCode);
        return authTrxn;
    }
}
