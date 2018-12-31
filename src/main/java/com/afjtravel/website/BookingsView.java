package com.afjtravel.website;

import com.afjtravel.website.database.BookingDAO;
import com.afjtravel.website.models.Booking;
import io.dropwizard.views.View;

import java.util.List;

public class BookingsView extends View {

    private final BookingDAO bookingDAO;

    public BookingsView(BookingDAO bookingDAO) {
        super("bookings.mustache");
        this.bookingDAO = bookingDAO;
    }

    public List<Booking> getBooking() {return bookingDAO.listBookings();}




}
