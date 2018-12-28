package com.afjtravel.website;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ServiceApplication extends Application<ServiceConfiguration> {
    public static void main(String[] args) throws Exception {
        new ServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "afj-travel";
    }

    @Override
    public void initialize(Bootstrap<ServiceConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(ServiceConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(new HeartbeatResource());
    }

}
