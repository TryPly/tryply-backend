package com.planit.dto.cost

import com.planit.dto.costunit.UpdateCostUnitDTO
import com.planit.model.enums.CostType
import jakarta.validation.constraints.Positive
import jakarta.validation.constraints.Size

class UpdateCostDTO(
    val reason: String,

    @field:Positive
    val totalAmount: Double,

    @field:Size(min = 2, max = 4)
    val currency: String,

    val costUnitList : List<UpdateCostUnitDTO>,

    @field:Size(min = 1)
    val payers : List<String>,

    @field:Size(min = 3, max = 50)
    val payedBy : String,

    val date : Long?,

    val costType: CostType
)
