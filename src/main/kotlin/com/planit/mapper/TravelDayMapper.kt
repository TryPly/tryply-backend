package com.planit.mapper

import com.planit.dto.travelday.CreateTravelDayDTO
import com.planit.dto.travelday.RetrieveTravelDayDTO
import com.planit.dto.travelday.TravelDayDTO
import com.planit.dto.travelday.UpdateTravelDayDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface TravelDayMapper {

    fun toDTO(travelDayDTO: CreateTravelDayDTO) : TravelDayDTO

    fun toDTO(travelDayDTO: UpdateTravelDayDTO) : TravelDayDTO

    fun toDTO(travelDayDTO: RetrieveTravelDayDTO) : TravelDayDTO

}