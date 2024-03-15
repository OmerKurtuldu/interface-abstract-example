package com.demo.business.abstracts;

import com.demo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void save(Customer customer){
        System.out.println("Saved to db : " + customer.getName());
    }
}
