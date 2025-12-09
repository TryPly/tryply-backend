package com.planit.resource

import com.planit.dto.traveler.CreateTravelerDTO
import com.planit.dto.traveler.TravelerDTO
import com.planit.mapper.TravelerMapper
import com.planit.model.enums.TravelerRole
import com.planit.service.TravelerService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType

@ApplicationScoped
@Path("/api/travelers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
class TravelerResource {

    val travelerService : TravelerService
    val travelerMapper : TravelerMapper

    @Inject
    constructor(travelerService: TravelerService, travelerMapper: TravelerMapper) {
        this.travelerService = travelerService
        this.travelerMapper = travelerMapper
    }

    @POST
    fun createTraveler(travelerDTO: CreateTravelerDTO): TravelerDTO {
        val traveler = travelerMapper.toDTO(travelerDTO)
        return travelerService.createTraveler(traveler)
    }

    @GET
    fun getTravelers(): List<TravelerDTO> {
        return travelerService.getTravelers()
    }

    @GET
    @Path("/{travelerId}")
    fun getTravelerById(travelerId: Long): TravelerDTO {
        return travelerService.getTravelerById(travelerId)
    }

    @PATCH
    @Path("/{travelerId}")
    fun updateTraveler(travelerId: Long, role: TravelerRole) {
        travelerService.updateTraveler(travelerId, role)
    }

    @DELETE
    @Path("/{travelerId}")
    fun deleteTraveler(travelerId: Long) {
        travelerService.deleteTraveler(travelerId)
    }

}