package com.stepp.dennis.model;

import com.stepp.dennis.model.account.CustomerAccount;

public interface Account {

    CustomerAccount create(String Name, String Id);
}
