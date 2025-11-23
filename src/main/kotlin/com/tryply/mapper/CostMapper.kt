package com.tryply.mapper

import com.tryply.dto.cost.CostDTO
import com.tryply.dto.cost.CreateCostDTO
import com.tryply.dto.cost.RetrieveCostDTO
import com.tryply.dto.cost.UpdateCostDTO
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
interface CostMapper {

    @Mapping(target = "costType", defaultValue = "COST")
    fun toDTO(costDTO: CreateCostDTO) : CostDTO

    @Mapping(target = "costType", defaultValue = "COST")
    fun toDTO(costDTO: UpdateCostDTO) : CostDTO

    fun toDTO(costDTO: RetrieveCostDTO) : CostDTO
}
