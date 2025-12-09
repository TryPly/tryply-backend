package com.planit.mapper

import com.planit.dto.travel.CreateTravelDTO
import com.planit.dto.travel.RetrieveTravelDTO
import com.planit.dto.travel.TravelDTO
import com.planit.dto.travel.UpdateTravelDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface TravelMapper {

    fun toDTO(travelDTO: CreateTravelDTO) : TravelDTO

    fun toDTO(travelDTO: UpdateTravelDTO) : TravelDTO

    fun toDTO(travelDTO: RetrieveTravelDTO) : TravelDTO

}