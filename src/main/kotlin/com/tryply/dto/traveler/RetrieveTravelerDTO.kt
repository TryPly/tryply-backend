package com.tryply.dto.traveler

data class RetrieveTravelerDTO (
    val travelerId: Long?,
    val username: String,
    val travelId: Long,
    val role: String?
)