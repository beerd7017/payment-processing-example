package com.stepp.dennis.model.request;

import com.stepp.dennis.model.RequestPayload;
import com.stepp.dennis.model.account.CustomerAccount;
import com.stepp.dennis.model.authorization.AuthorizationTransaction;
import com.stepp.dennis.model.creditcard.CreditCard;

public class RequestPayloadFactory implements RequestPayload {

    AuthorizationRequest authRequest = new AuthorizationRequest();

    @Override
    public AuthorizationRequest create(CustomerAccount customerAccount, CreditCard creditCard, AuthorizationTransaction authTrxn) {
       /* System.out.println("Created TransactionType:");

        System.out.println("Customer Account :");
        System.out.println("Name: " + customerAccount.getName());
        System.out.println("Id: " + customerAccount.getId());

        System.out.println("Credit Card Infomation: ");
        System.out.println("Card Number: " + creditCard.getCardNumber());
        System.out.println("Expiration Date: " + creditCard.getExpirationDate());
        System.out.println("Card Code: " + creditCard.getCardCode());

        System.out.println("AuthorizationTransaction Information: ");
        System.out.println("Key: " +authTrxn.getTransactionKey());
        System.out.println("RefId: " +authTrxn.getRefId());
        System.out.println("TransactionType: " +authTrxn.getTransactionType());
        System.out.println("Amount: " +authTrxn.getAmount());
        System.out.println("Currency Code : " +authTrxn.getCurrencyCode());
        */
        authRequest.setCustomerAccount(customerAccount);
        authRequest.setAuthTrxn(authTrxn);
        authRequest.setCreditCard(creditCard);
        return authRequest;
    }
}
