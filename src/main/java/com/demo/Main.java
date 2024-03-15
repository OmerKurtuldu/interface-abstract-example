package com.demo;

import com.demo.business.abstracts.BaseCustomerManager;
import com.demo.adapter.MernisServiceAdapter;
import com.demo.business.concrete.CustomerCheckManager;
import com.demo.business.concrete.NeroCustomerManager;
import com.demo.business.concrete.StarbucksCustomerManager;
import com.demo.entities.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Ömer", "Kurtuldu", 1999, "12345678900");

        BaseCustomerManager neroCustomerManager = new NeroCustomerManager();

        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter()); //real check
        BaseCustomerManager starbucksCustomerManager2 = new StarbucksCustomerManager(new CustomerCheckManager()); //fake check

        neroCustomerManager.save(customer);
        starbucksCustomerManager2.save(customer);
        starbucksCustomerManager.save(customer);
    }
}