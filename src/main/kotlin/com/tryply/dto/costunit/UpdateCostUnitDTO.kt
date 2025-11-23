package com.tryply.dto.costunit

class UpdateCostUnitDTO(
    val travelerUsername: String,
    val amount: Double, // If null use full cost amount divided by number of travelers (some travelers can have custom amounts and some can have )
    val currency: String?
)
