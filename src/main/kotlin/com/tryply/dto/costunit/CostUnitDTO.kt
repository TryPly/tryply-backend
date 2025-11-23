package com.tryply.dto.costunit

data class CostUnitDTO (
    val id: Long?,
    val amount: Double?,
    val currency: String,
    val travelerUsername: String,
    val costId: Long?
)
