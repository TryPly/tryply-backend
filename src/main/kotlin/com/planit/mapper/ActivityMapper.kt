package com.planit.mapper

import com.planit.dto.activity.ActivityDTO
import com.planit.dto.activity.CreateActivityDTO
import com.planit.dto.activity.CreateActivityDayDTO
import com.planit.dto.activity.RetrieveActivityDTO
import com.planit.dto.activity.UpdateActivityDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface ActivityMapper {

    fun toDTO(activityDTO: CreateActivityDTO) : ActivityDTO

    fun toDTO(activityDTO: CreateActivityDayDTO) : ActivityDTO

    fun toDTO(activityDTO: UpdateActivityDTO) : ActivityDTO

    fun toDTO(activityDTO: RetrieveActivityDTO) : ActivityDTO

}