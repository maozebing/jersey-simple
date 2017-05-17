package com.example;

import org.glassfish.jersey.moxy.json.MoxyJsonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.simple.SimpleContainerFactory;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;

/**
 * Main class.
 *
 */
public class Main {

    public static final String BASE_URI = "http://localhost:8080/";

    /**
     * Main method.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        final ResourceConfig rc = new ResourceConfig();
        rc.packages("com.example");
        rc.register(MoxyJsonFeature.class);

        SimpleContainerFactory.create(URI.create(BASE_URI), rc);

    }

}

