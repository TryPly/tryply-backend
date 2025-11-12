package com.tryply.dto.travelday

data class CreateTravelDayDTO (
    val destination: String,
    val name: String,
    val startDate: String,
    val endDate: String,
    val imageUrl: String?,
    val days: Int,
)
