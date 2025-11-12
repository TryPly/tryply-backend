package com.tryply.dto.traveler

import com.tryply.model.enums.TravelerRole

data class UpdateTravelerDTO(
    val username: String,
    val role: TravelerRole?
)
