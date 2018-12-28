package com.afjtravel.website;

import io.dropwizard.views.View;

public class IndexView extends View {
    protected IndexView() {
        super("index.mustache");
    }
}
