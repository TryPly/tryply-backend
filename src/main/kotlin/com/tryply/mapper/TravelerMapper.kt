package com.tryply.mapper

import com.tryply.dto.traveler.CreateTravelerDTO
import com.tryply.dto.traveler.RetrieveTravelerDTO
import com.tryply.dto.traveler.TravelerDTO
import com.tryply.dto.traveler.UpdateTravelerDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface TravelerMapper {

    fun toDTO(travelerDTO: CreateTravelerDTO): TravelerDTO

    fun toDTO(travelerDTO: RetrieveTravelerDTO): TravelerDTO

    fun toDTO(travelerDTO: UpdateTravelerDTO): TravelerDTO

}