package org.pacaruso.web;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name = "example.color", defaultValue = "blue")
    
    String color; 

    @GET
    public String hello() {
        return String.format("Hello from %s service", color.toUpperCase());
    }
}
