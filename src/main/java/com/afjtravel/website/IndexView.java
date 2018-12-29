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

    public List<Map<String, String>> getCustomerNames() {
        return customerDAO
                .getNames()
                .stream()
                .filter(s -> null != s)
                .sorted(String::compareToIgnoreCase)
                .distinct()
                .map(s -> {
                    HashMap<String, String> map = new HashMap<>();
                    map.put("name", s);
                    return map;
                })
                .collect(Collectors.toList());
    }
}
