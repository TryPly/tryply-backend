package com.tryply.dto.travel

data class CreateTravelDTO (
    val destination: String,
    val name: String,
    val startDate: String,
    val endDate: String,
    val imageUrl: String?,
    val days: Int,
)
