package com.tryply.mapper

import com.tryply.dto.travelday.CreateTravelDayDTO
import com.tryply.dto.travelday.RetrieveTravelDayDTO
import com.tryply.dto.travelday.TravelDayDTO
import com.tryply.dto.travelday.UpdateTravelDayDTO
import org.mapstruct.Mapper

@Mapper(componentModel = "cdi")
interface TravelDayMapper {

    fun toDTO(travelDayDTO: CreateTravelDayDTO) : TravelDayDTO

    fun toDTO(travelDayDTO: UpdateTravelDayDTO) : TravelDayDTO

    fun toDTO(travelDayDTO: RetrieveTravelDayDTO) : TravelDayDTO

}