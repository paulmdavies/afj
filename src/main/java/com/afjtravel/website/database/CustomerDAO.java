package com.afjtravel.website.database;

import com.afjtravel.website.models.Customer;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

import java.sql.ResultSet;
import java.util.List;

public interface CustomerDAO {
    @SqlQuery("SELECT CompanyName FROM tuzahrac_travel.customer")
    List<String> getNames();

    @SqlQuery("SELECT * FROM tuzahrac_travel.customer WHERE CompanyName=:companyName")
    Customer getCustomerByName(@Bind("companyName") String companyName);
}
