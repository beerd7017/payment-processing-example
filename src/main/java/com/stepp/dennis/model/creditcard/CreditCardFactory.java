package com.stepp.dennis.model.creditcard;

import com.stepp.dennis.model.PaymentInstrument;

public class CreditCardFactory implements PaymentInstrument {
    CreditCard creditCard = new CreditCard();

    @Override
    public CreditCard create(String CardNumber, String ExpirationDate, String CardCode) {
        creditCard.setCardNumber(CardNumber);
        creditCard.setExpirationDate(ExpirationDate);
        creditCard.setCardCode(CardCode);
        return creditCard;
    }
}
