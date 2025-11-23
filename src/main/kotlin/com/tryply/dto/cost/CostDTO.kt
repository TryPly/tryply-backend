package com.tryply.dto.cost

import com.tryply.dto.costunit.CostUnitDTO
import com.tryply.model.enums.CostType

data class CostDTO (
    val reason: String,
    val totalAmount: Double,
    val currency: String,
    val costUnitList: List<CostUnitDTO>,
    val payedBy : String,
    val createdDate : Long,
    val lastUpdatedDate : Long,
    val payers : List<String>,
    val id : Long?,
    val date : Long?,
    val travelId : Long,
    val costType: CostType

)
