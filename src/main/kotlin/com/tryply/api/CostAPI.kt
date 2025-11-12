package com.tryply.api

import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.DELETE
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces

@ApplicationScoped
@Path("/travel/{travelId}/costs")
@Produces("application/json")
@Consumes("application/json")
class CostAPI {

    @POST
    fun addCost(): String {
        // Implementation for adding a cost goes here
        return "Cost added"
    }

    @GET
    fun getCosts(): String {
        // Implementation for retrieving costs goes here
        return "List of costs"
    }

    @GET
    @Path("/{costId}")
    fun getCostById(): String {
        // Implementation for retrieving a cost by ID goes here
        return "Cost details"
    }

    @PUT
    fun updateCost(): String {
        // Implementation for updating a cost goes here
        return "Cost updated"
    }

    @DELETE
    fun deleteCost(): String {
        // Implementation for deleting a cost goes here
        return "Cost deleted"
    }

}