package com.stepp.dennis.model.creditcard;

public class CreditCard {
    private static String cardNumber;

    public static String getCardNumber() {
        return cardNumber;
    }

    public static void setCardNumber(String cardNumber) {
        CreditCard.cardNumber = cardNumber;
    }

    public static String getExpirationDate() {
        return expirationDate;
    }

    public static void setExpirationDate(String expirationDate) {
        CreditCard.expirationDate = expirationDate;
    }

    public static String getCardCode() {
        return cardCode;
    }

    public static void setCardCode(String cardCode) {
        CreditCard.cardCode = cardCode;
    }

    private static String expirationDate;
    private static String cardCode;
}
