package com.afjtravel.website.database;

import com.afjtravel.website.models.Customer;
import com.afjtravel.website.models.Quote;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

import java.util.List;

public interface QuoteDAO {
    @SqlQuery("SELECT quote.QuoteID,quotestatus.QuoteStatusDesc,customer.FirstName,customer.LastName,customer.CompanyName FROM tuzahrac_travel.quote INNER JOIN tuzahrac_travel.customer ON quote.CustomerID=customer.CustomerID INNER JOIN tuzahrac_travel.quotestatus ON quote.QuoteStatusID=quotestatus.QuoteStatusID ORDER BY quote.QuoteID desc")
    List<Quote> listQuotes();
}
