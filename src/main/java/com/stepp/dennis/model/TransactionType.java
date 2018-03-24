package com.stepp.dennis.model;

import com.stepp.dennis.model.authorization.AuthorizationTransaction;

public interface TransactionType {
    AuthorizationTransaction create(String TransactionKey, String RefId, String TransactionType, String Amount, String CurrencyCode);
}
