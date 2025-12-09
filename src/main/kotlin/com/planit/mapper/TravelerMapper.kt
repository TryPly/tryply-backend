package com.planit.mapper

import com.planit.dto.traveler.CreateTravelerDTO
import com.planit.dto.traveler.RetrieveTravelerDTO
import com.planit.dto.traveler.TravelerDTO
import com.planit.dto.traveler.UpdateTravelerDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface TravelerMapper {

    fun toDTO(travelerDTO: CreateTravelerDTO): TravelerDTO

    fun toDTO(travelerDTO: RetrieveTravelerDTO): TravelerDTO

    fun toDTO(travelerDTO: UpdateTravelerDTO): TravelerDTO

}