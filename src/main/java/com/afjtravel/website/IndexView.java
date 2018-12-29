package com.afjtravel.website;

import com.afjtravel.website.database.CustomerDAO;
import io.dropwizard.views.View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IndexView extends View {
    private final CustomerDAO customerDAO;

    protected IndexView(CustomerDAO customerDAO) {
        super("index.mustache");
        this.customerDAO = customerDAO;
    }
}
