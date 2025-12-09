package com.planit.dto.travel

data class UpdateTravelDTO(
    val destination: String,
    val name: String,
    val startDate: String,
    val endDate: String,
    val imageUrl: String?,
    val days: Int,
)
