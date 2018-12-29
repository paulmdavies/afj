package com.afjtravel.website.models;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuoteMapper implements ResultSetMapper<Quote>
{
    public Quote map(int index, ResultSet r, StatementContext ctx) throws SQLException
    {
        return new Quote(
                r.getString("QuoteID"),
                r.getString("QuoteStatusDesc"),
                r.getString("FirstName"),
                r.getString("LastName"),
                r.getString("CompanyName")
        );
    }
}
