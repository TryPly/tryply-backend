package com.tryply.mapper

import com.tryply.dto.travel.CreateTravelDTO
import com.tryply.dto.travel.RetrieveTravelDTO
import com.tryply.dto.travel.TravelDTO
import com.tryply.dto.travel.UpdateTravelDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface TravelMapper {

    fun toDTO(travelDTO: CreateTravelDTO) : TravelDTO

    fun toDTO(travelDTO: UpdateTravelDTO) : TravelDTO

    fun toDTO(travelDTO: RetrieveTravelDTO) : TravelDTO

}