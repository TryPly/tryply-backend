package com.tryply.api

import com.tryply.dto.activity.ActivityDTO
import com.tryply.dto.activity.CreateActivityDTO
import com.tryply.dto.activity.UpdateActivityDTO
import com.tryply.mapper.ActivityMapper
import com.tryply.service.ActivityService
import com.tryply.validator.ActivityValidator
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType

@ApplicationScoped
@Path("/travels/{travelId}/activities")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class ActivityAPI @Inject constructor(
    private val activityService: ActivityService,
    private val activityMapper: ActivityMapper,
    private val activityValidator: ActivityValidator
)
{


    @POST
    fun createActivity(travelId: Long, activityDTO: CreateActivityDTO): ActivityDTO {
        val activity = activityMapper.toDTO(activityDTO)
        return activityService.createActivity(travelId, activity)
    }

    @GET
    fun retrieveActivities(travelId: Long): List<ActivityDTO> {
        return activityService.retrieveActivities(travelId)
    }

    @PUT
    @Path("/{activityId}")
    fun updateActivity(travelId: Long, activityId: Long, activityDTO: UpdateActivityDTO) {
        val activity = activityMapper.toDTO(activityDTO)
        activityService.updateActivity(travelId, activityId, activity)
    }

    @DELETE
    @Path("/{activityId}")
    fun deleteActivity(travelId: Long, activityId: Long) {
        activityService.deleteActivity(travelId, activityId)
    }

    @PATCH
    @Path("/{activityId}")
    fun markActivityCompleted(travelId: Long, activityId: Long, completed: Boolean): ActivityDTO {
        return activityService.markActivityCompleted(travelId, activityId, completed)
    }

}
