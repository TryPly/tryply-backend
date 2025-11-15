package com.tryply.resource

import com.tryply.dto.traveler.TravelerDTO
import com.tryply.model.enums.TravelerRole
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.DELETE
import jakarta.ws.rs.GET
import jakarta.ws.rs.PATCH
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@ApplicationScoped
@Path("/travelers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
class TravelerResource {

    @POST
    fun createTraveler(): String {
        // Implementation for creating a traveler goes here
        return "Traveler created"
    }

    @GET
    fun getTravelers(): List<TravelerDTO> {
        // Implementation for retrieving travelers goes here
        return emptyList()
    }

    @GET
    @Path("/{travelerId}")
    fun getTravelerById(travelerId: Long): TravelerDTO {
        // Implementation for retrieving a traveler by ID goes here
        return TravelerDTO(id = travelerId)
    }

    @PATCH
    @Path("/{travelerId}")
    fun updateTraveler(travelerId: Long, role: TravelerRole) {

    }

    @DELETE
    @Path("/{travelerId}")
    fun deleteTraveler(travelerId: Long) {

    }

}