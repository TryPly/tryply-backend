package com.planit.mapper

import com.planit.dto.cost.CostDTO
import com.planit.dto.refund.CreateRefundDTO
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface RefundMapper {

    @Mapping(target = "costType", defaultValue = "REFUND")
    fun toDTO(costDTO: CreateRefundDTO) : CostDTO
}