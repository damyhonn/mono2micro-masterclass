package com.damyhonn.travelorder;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8081/flight")
public interface FlightService {

    @GET
    @Path("findById")
    public Flight findById(@QueryParam("id") long id);

    @GET
    @Path("findByTravelOrderId")
    public Flight findByTravelOrderId(@QueryParam("travelOrderId") long travelOrderId);

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @POST
    public Flight newFlight(Flight flight);
}
