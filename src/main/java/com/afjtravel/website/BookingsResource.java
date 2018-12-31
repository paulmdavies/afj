package com.afjtravel.website;

import com.afjtravel.website.database.BookingDAO;
import com.afjtravel.website.database.QuoteDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bookings")
@Produces(MediaType.TEXT_HTML)
public class BookingsResource {


    private final BookingDAO bookingDao;

    public BookingsResource(BookingDAO bookingDao)
    {
        this.bookingDao = bookingDao;
    }

    @GET
    public BookingsView getBookings() {
        return new BookingsView(bookingDao);
    }
}
