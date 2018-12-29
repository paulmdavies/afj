package com.afjtravel.website;

import com.afjtravel.website.database.CustomerDAO;
import com.afjtravel.website.database.QuoteDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/quotes")
@Produces(MediaType.TEXT_HTML)
public class QuotesResource {


    private final QuoteDAO quoteDao;

    public QuotesResource(QuoteDAO quoteDao) {

        this.quoteDao = quoteDao;
    }

    @GET
    public QuotesView getQuotes() {
        return new QuotesView(quoteDao);
    }
}
