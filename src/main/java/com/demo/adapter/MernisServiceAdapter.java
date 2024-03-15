package com.demo.adapter;

import com.demo.business.abstracts.CustomerCheckService;
import com.demo.entities.Customer;
import com.demo.mernis.TEMKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean ChekIfRealPerson(Customer customer) {
        try {
            TEMKPSPublicSoap client = new TEMKPSPublicSoap();
            return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getName(), customer.getSurName(), customer.getDateOfBirth());
        } catch (Exception e) {
            return false;
        }
    }
}
