package com.afjtravel.website.database;

import org.skife.jdbi.v2.sqlobject.SqlQuery;

import java.util.List;

public interface CustomerDAO {
    @SqlQuery("SELECT CompanyName FROM tuzahrac_travel.customer;")
    List<String> getNames();
}
