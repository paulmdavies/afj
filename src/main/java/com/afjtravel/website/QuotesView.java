package com.afjtravel.website;

import com.afjtravel.website.database.QuoteDAO;
import com.afjtravel.website.models.Quote;
import io.dropwizard.views.View;

import java.util.ArrayList;
import java.util.List;

public class QuotesView extends View {

    private final QuoteDAO quoteDao;

    public QuotesView(QuoteDAO quoteDao) {
        super("quotes.mustache");
        this.quoteDao = quoteDao;
    }

    public List<Quote> getQuotes() {
        return quoteDao.listQuotes();
    }



}
