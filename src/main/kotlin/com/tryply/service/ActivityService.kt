package com.tryply.service

import com.tryply.dto.activity.ActivityDTO
import com.tryply.model.entity.Activity
import com.tryply.repository.ActivityRepository
import com.tryply.repository.TravelRepository
import com.tryply.validator.ActivityValidator
import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional
import jakarta.ws.rs.NotFoundException


@ApplicationScoped
@Transactional
class ActivityService {

    val travelRepository: TravelRepository = TravelRepository()
    val activityRepository = ActivityRepository()


    fun createActivity(travelId: Long, activityDTO: ActivityDTO): ActivityDTO {
        val activityValidator = ActivityValidator()

        val travelEntity = travelRepository.findById(travelId)
            ?: throw IllegalArgumentException("Travel not found")

        activityValidator.validateActivityData(activityDTO)
        val activity = Activity().apply {
            name = activityDTO.name
            description = activityDTO.description ?: ""
            travel = travelEntity
        }
        activity.persist()

        return ActivityDTO(
            id = activity.id!!,
            name = activity.name,
            description = activity.description,
            completed = activity.completed,
            travelId = travelId,
            travelDayId = null,
            time = null,
            createDate = activity.createdDate,
            lastUpdateDate = activity.lastUpdateDate
        )


    }

    fun retrieveActivities(travelId: Long): List<ActivityDTO> {
        val activities = activityRepository.find("travel.id", travelId).list()

        return activities.map { activity ->
            ActivityDTO(
                id = activity.id!!,
                name = activity.name,
                description = activity.description,
                completed = activity.completed,
                travelId = travelId,
                travelDayId = null,
                time = null,
                createDate = activity.createdDate,
                lastUpdateDate = activity.lastUpdateDate
            )
        }
    }

    fun updateActivity(travelId: Long, activityId: Long, activityDTO: ActivityDTO) {
        val activityValidator = ActivityValidator()
        val activity = activityRepository.find(
            "travel.id = ?1 and id = ?2",
            travelId, activityId
        ).firstResult() ?: throw NotFoundException("Activity not found")
        activityValidator.validateActivityData(activityDTO)
        activity.apply {
            name = activityDTO.name
            description = activityDTO.description ?: ""
        }
        activity.persist()

    }

    fun deleteActivity(travelId: Long, activityId: Long) {
        val activity = activityRepository.find(
            "travel.id = ?1 and id = ?2",
            travelId, activityId
        ).firstResult() ?: throw NotFoundException("Activity not found")

        activity.delete()
    }

    fun markActivityCompleted(travelId: Long, activityId: Long, completed: Boolean): ActivityDTO {
        val activity = activityRepository.find(
            "travel.id = ?1 and id = ?2",
            travelId, activityId
        ).firstResult() ?: throw NotFoundException("Activity not found")

        activity.completed = completed
        activity.persist()

        return ActivityDTO(
            id = activity.id!!,
            name = activity.name,
            description = activity.description,
            completed = activity.completed,
            travelId = travelId,
            travelDayId = null,
            time = null,
            createDate = activity.createdDate,
            lastUpdateDate = activity.lastUpdateDate
        )
    }


}