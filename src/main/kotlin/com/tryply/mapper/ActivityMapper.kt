package com.tryply.mapper

import com.tryply.dto.activity.ActivityDTO
import com.tryply.dto.activity.CreateActivityDTO
import com.tryply.dto.activity.CreateActivityDayDTO
import com.tryply.dto.activity.RetrieveActivityDTO
import com.tryply.dto.activity.UpdateActivityDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface ActivityMapper {

    fun toDTO(activityDTO: CreateActivityDTO) : ActivityDTO

    fun toDTO(activityDTO: CreateActivityDayDTO) : ActivityDTO

    fun toDTO(activityDTO: UpdateActivityDTO) : ActivityDTO

    fun toDTO(activityDTO: RetrieveActivityDTO) : ActivityDTO

}