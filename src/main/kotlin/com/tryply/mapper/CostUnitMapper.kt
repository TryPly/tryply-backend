package com.tryply.mapper

import com.tryply.dto.costunit.CostUnitDTO
import com.tryply.dto.costunit.CreateCostUnitDTO
import com.tryply.dto.costunit.UpdateCostUnitDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface CostUnitMapper {

    fun toDTO(costUnitDTO: CreateCostUnitDTO) : CostUnitDTO
    fun toDTO(costUnitDTO: UpdateCostUnitDTO) : CostUnitDTO
}