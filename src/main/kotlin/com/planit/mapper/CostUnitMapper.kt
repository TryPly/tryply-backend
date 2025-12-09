package com.planit.mapper

import com.planit.dto.costunit.CostUnitDTO
import com.planit.dto.costunit.CreateCostUnitDTO
import com.planit.dto.costunit.UpdateCostUnitDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface CostUnitMapper {

    fun toDTO(costUnitDTO: CreateCostUnitDTO) : CostUnitDTO
    fun toDTO(costUnitDTO: UpdateCostUnitDTO) : CostUnitDTO
}