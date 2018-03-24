package com.stepp.dennis.model;

import com.stepp.dennis.model.creditcard.CreditCard;

public interface PaymentInstrument {

    CreditCard create(String CardNumber, String ExpirationDate, String CardCode);
}
