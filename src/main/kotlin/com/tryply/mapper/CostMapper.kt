package com.tryply.mapper

import com.tryply.dto.cost.CostDTO
import com.tryply.dto.cost.CreateCostDTO
import com.tryply.dto.cost.RetrieveCostDTO
import com.tryply.dto.cost.UpdateCostDTO
import org.mapstruct.Mapper

@Mapper(componentModel = "cdi")
interface CostMapper {

    fun toDTO(costDTO: CreateCostDTO) : CostDTO

    fun toDTO(costDTO: UpdateCostDTO) : CostDTO

    fun toDTO(costDTO: RetrieveCostDTO) : CostDTO
}
