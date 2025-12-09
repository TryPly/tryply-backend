package com.planit.dto.traveler

import com.planit.model.enums.TravelerRole

class CreateTravelerDTO (
    val username: String,
    val travelId: Long,
    val role: TravelerRole?
)
