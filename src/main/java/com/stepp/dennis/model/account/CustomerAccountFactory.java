package com.stepp.dennis.model.account;

import com.stepp.dennis.model.Account;

public class CustomerAccountFactory implements Account {
    CustomerAccount customerAccount = new CustomerAccount();

    @Override
    public CustomerAccount create(String Name, String Id) {
        customerAccount.setName(Name);
        customerAccount.setId(Id);
        return customerAccount;
    }
}
