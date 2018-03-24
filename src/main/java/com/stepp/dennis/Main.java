package com.stepp.dennis;

import com.stepp.dennis.model.account.CustomerAccount;
import com.stepp.dennis.model.account.CustomerAccountFactory;
import com.stepp.dennis.model.authorization.AuthorizationFactory;
import com.stepp.dennis.model.authorization.AuthorizationTransaction;
import com.stepp.dennis.model.creditcard.CreditCard;
import com.stepp.dennis.model.creditcard.CreditCardFactory;
import com.stepp.dennis.model.request.AuthorizationRequest;
import com.stepp.dennis.model.request.RequestPayloadFactory;
import jdk.jshell.spi.ExecutionControl;

import javax.xml.transform.stream.StreamSource;

public class Main {

    public static void main(String[] args) throws Exception {
        XLSTReader xlstReader = new XLSTReader();
        StreamSource source = new StreamSource("C:\\Users\\dstepp\\IdeaProjects\\oracle_payments\\src\\main\\resources\\xml\\test\\IBY_FCI_1_0.xsd.xml");
        StreamSource styleSource = new StreamSource("C:\\Users\\dstepp\\IdeaProjects\\oracle_payments\\src\\main\\resources\\xml\\transform\\ANetRequest.xsl");

        transformXML(xlstReader, source, styleSource);

        CustomerAccount customerAccount = buildCustomerAccount("Han Solo", "99999456654");
        CreditCard creditCard = buildCreditCard("5424000000000015", "2020-12", "999");
        AuthorizationTransaction authTrxn = buildAuthorization("2g5E2P8Dqg9a46SW", "123456", "authOnlyTransaction", "5", "USD");
        AuthorizationRequest authRequest = buildRequest(customerAccount, creditCard, authTrxn);
        submitRequest(authRequest);
    }

    public static void transformXML(XLSTReader xlstReader, StreamSource source, StreamSource styleSource) throws Exception {
        xlstReader.transformXML(source, styleSource);
    }

    public static CustomerAccount buildCustomerAccount(String Name, String Id) {
        CustomerAccountFactory customerAccountFactory = new CustomerAccountFactory();
        return customerAccountFactory.create(Name, Id);
    }

    public static CreditCard buildCreditCard(String CardNumber, String ExpirationDate, String CardCode) {
        CreditCardFactory creditCardFactory = new CreditCardFactory();
        return creditCardFactory.create(CardNumber, ExpirationDate, CardCode);
    }

    public static AuthorizationTransaction buildAuthorization(String TransactionKey, String RefId, String TransactionType, String Amount, String CurrencyCode) {
        AuthorizationFactory authorizationFactory = new AuthorizationFactory();
        return authorizationFactory.create(TransactionKey, RefId, TransactionType, Amount, CurrencyCode);
    }

    public static AuthorizationRequest buildRequest(CustomerAccount customerAccount, CreditCard creditCard, AuthorizationTransaction authTrxn) {
        RequestPayloadFactory requestFactory = new RequestPayloadFactory();
        return requestFactory.create(customerAccount, creditCard, authTrxn);
    }

    public static void submitRequest(AuthorizationRequest authRequest) throws ExecutionControl.NotImplementedException {
        //TODO: Implement this method.
    }
}
