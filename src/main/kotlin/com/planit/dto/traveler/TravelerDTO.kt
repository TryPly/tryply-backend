package com.planit.dto.traveler

import com.planit.model.enums.TravelerRole

data class TravelerDTO (
    val id: Long,
    val username: String,
    val role : TravelerRole?,
    val createdDate: Long,
    val lastUpdatedDate: Long,
    val travelId: Long
    )