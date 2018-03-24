package com.stepp.dennis.model.authorization;

public class AuthorizationTransaction {
    public static String getTransactionKey() {
        return TransactionKey;
    }

    public static void setTransactionKey(String transactionKey) {
        TransactionKey = transactionKey;
    }

    public static String getRefId() {
        return RefId;
    }

    public static void setRefId(String refId) {
        RefId = refId;
    }

    public static String getTransactionType() {
        return TransactionType;
    }

    public static void setTransactionType(String transactionType) {
        TransactionType = transactionType;
    }

    public static String getAmount() {
        return Amount;
    }

    public static void setAmount(String amount) {
        Amount = amount;
    }

    public static String getCurrencyCode() {
        return CurrencyCode;
    }

    public static void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    private static String TransactionKey;
    private static String RefId;
    private static String TransactionType;
    private static String Amount;
    private static String CurrencyCode;
}
