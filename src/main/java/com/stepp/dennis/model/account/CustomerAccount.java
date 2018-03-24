package com.stepp.dennis.model.account;

public class CustomerAccount {
    private static String Name;

    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }

    public static String getId() {
        return Id;
    }

    public static void setId(String id) {
        Id = id;
    }

    private static String Id;
}
