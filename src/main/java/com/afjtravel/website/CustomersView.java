package com.afjtravel.website;

import com.afjtravel.website.database.CustomerDAO;
import com.afjtravel.website.models.Customer;
import io.dropwizard.views.View;

import java.util.ArrayList;
import java.util.List;

public class CustomersView extends View {
    private final CustomerDAO customerDao;

    public CustomersView(CustomerDAO customerDao) {
        super("customers.mustache");
        this.customerDao = customerDao;
    }

    public List<Customer> getCustomers() {
//        ArrayList<Customer> customers = new ArrayList<>();
//
//        customers.add(new Customer("Mr", "brian", "Bloggs", "Platinum"));
//        customers.add(new Customer("Mr", "gill", "Bloggs", "Platinum"));
//        customers.add(new Customer("Mr", "john", "Bloggs", "Platinum"));
//
//        return customers;

        return customerDao.listCustomers();
    }
}
