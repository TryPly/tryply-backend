package com.planit.dto.traveler

import com.planit.model.enums.TravelerRole

data class UpdateTravelerDTO(
    val username: String,
    val role: TravelerRole?
)
