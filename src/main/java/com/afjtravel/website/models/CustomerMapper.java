package com.afjtravel.website.models;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements ResultSetMapper<Customer>
{
    public Customer map(int index, ResultSet r, StatementContext ctx) throws SQLException
    {
        return new Customer(
                r.getString("TitleDesc"),
                r.getString("FirstName"),
                r.getString("LastName"),
                r.getString("CustomerLevelDesc")
        );
    }
}
