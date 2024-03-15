package com.demo.business.concrete;

import com.demo.business.abstracts.CustomerCheckService;
import com.demo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean ChekIfRealPerson(Customer customer) {
        return true;
    }
}
