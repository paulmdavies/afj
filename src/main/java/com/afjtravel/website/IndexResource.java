package com.afjtravel.website;

import com.afjtravel.website.database.CustomerDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class IndexResource {
    private final CustomerDAO customerDao;

    public IndexResource(CustomerDAO customerDao) {
        this.customerDao = customerDao;
    }

    @GET
    public IndexView index() {
        List<String> customerName = customerDao.getNames();
        return new IndexView(customerName);
    }
}
