package com.afjtravel.website;

import com.afjtravel.website.database.CustomerDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
@Produces(MediaType.TEXT_HTML)
public class CustomerResource {
    private final CustomerDAO customerDao;

    public CustomerResource(CustomerDAO customerDao) {
        this.customerDao = customerDao;
    }

    @GET
    public CustomersView getCustomers() {
        return new CustomersView(customerDao);
    }
}
