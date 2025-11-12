package com.tryply.dto.traveler

import com.tryply.model.enums.TravelerRole

class CreateTravelerDTO (
    val username: String,
    val travelId: Long,
    val role: TravelerRole?
)
