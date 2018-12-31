// translating sql query results to java

package com.afjtravel.website.models;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingMapper implements ResultSetMapper<Booking>
{
    public Booking map(int index, ResultSet r, StatementContext ctx) throws SQLException
    {
        return new Booking(
                r.getString("QuoteID"),
                r.getString("QuoteStatusDesc"),
                r.getString("FirstName"),
                r.getString("LastName"),
                r.getString("CompanyName"),
                r.getString("Street"),
                r.getString("Town"),
                r.getString("County"),
                r.getString("Postcode"),
                r.getString("Lat"),
                r.getString("Lng"),
                r.getString("StartTime"),
                r.getString("GeneratedPrice")
        );
    }
}
