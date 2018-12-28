package com.afjtravel.website;

import io.dropwizard.views.View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IndexView extends View {
    private final List<String> customerNames;

    protected IndexView(List<String> customerNames) {
        super("index.mustache");
        this.customerNames = customerNames;
    }

    public List<Map<String, String>> getCustomerNames() {
        return customerNames
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
