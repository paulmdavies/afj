package com.afjtravel.website.database;

import com.afjtravel.website.models.Customer;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

import java.sql.ResultSet;
import java.util.List;

public interface CustomerDAO {
    @SqlQuery("SELECT title.TitleDesc, customer.FirstName, customer.LastName, customerlevel.CustomerLevelDesc FROM tuzahrac_travel.customer INNER JOIN tuzahrac_travel.title ON customer.Title = title.TitleID INNER JOIN tuzahrac_travel.customerlevel ON customer.CustomerLevelID = customerlevel.CustomerLevelID ORDER BY LastName ASC")
    List<Customer> listCustomers();
}
