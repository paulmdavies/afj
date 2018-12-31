package com.afjtravel.website.database;

import com.afjtravel.website.models.Booking;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

import java.util.List;

public interface BookingDAO {
    @SqlQuery("SELECT quote.QuoteID, quote.StartTime, quotestatus.QuoteStatusDesc,customer.FirstName,customer.LastName,customer.CompanyName, location.street, location.town, location.county, location.postcode, location.lat, location.lng, quote.StartTime, quote.GeneratedPrice FROM tuzahrac_travel.quote INNER JOIN tuzahrac_travel.customer ON quote.CustomerID=customer.CustomerID INNER JOIN tuzahrac_travel.quotestatus ON quote.QuoteStatusID=quotestatus.QuoteStatusID INNER JOIN tuzahrac_travel.location ON quote.ToLocationID=location.LocationID ORDER BY quote.QuoteID desc")
    List<Booking> listBookings();
}
