package com.tryply.resource

import com.tryply.mapper.CostMapper
import com.tryply.service.CostService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.ws.rs.*

@ApplicationScoped
@Path("/travel/{travelId}/costs")
@Produces("application/json")
@Consumes("application/json")
class CostResource {


    val costService : CostService
    val costMapper : CostMapper

    @Inject
    constructor(costService: CostService, costMapper: CostMapper) {
        this.costService = costService
        this.costMapper = costMapper
    }

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