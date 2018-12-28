package com.afjtravel.website;

import com.afjtravel.website.database.CustomerDAO;
import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.skife.jdbi.v2.DBI;

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
        bootstrap.setConfigurationSourceProvider(
            new SubstitutingSourceProvider(bootstrap.getConfigurationSourceProvider(),
                new EnvironmentVariableSubstitutor()
            )
        );

        bootstrap.addBundle(new ViewBundle<>());
    }

    @Override
    public void run(ServiceConfiguration configuration,
                    Environment environment) {
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
        final CustomerDAO customerDao = jdbi.onDemand(CustomerDAO.class);

        environment.jersey().register(new HeartbeatResource());
        environment.jersey().register(new IndexResource(customerDao));
    }

}
