package com.demo.business.concrete;

import com.demo.business.abstracts.BaseCustomerManager;
import com.demo.business.abstracts.CustomerCheckService;
import com.demo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if (customerCheckService.ChekIfRealPerson(customer)) {
            super.save(customer);
        } else {
            throw new RuntimeException("Not a valid person");
        }
    }
}
