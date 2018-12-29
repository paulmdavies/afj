package com.afjtravel.website;

import com.afjtravel.website.database.CustomerDAO;
import com.afjtravel.website.models.Customer;
import io.dropwizard.views.View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerView extends View {

    private final Customer customerByName;
    private final String customerName;

    public CustomerView(CustomerDAO customerDao, String customerName) {
        super("customer.mustache");
        this.customerName = customerName;

        customerByName = customerDao.getCustomerByName(customerName);
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerContactName() throws SQLException {
        return customerByName.getContactName();
    }

    public String getCustomerContactEmail() throws SQLException {
        return customerByName.getContactEmail();
    }
}
