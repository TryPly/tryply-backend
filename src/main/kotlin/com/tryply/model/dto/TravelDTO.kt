package com.tryply.model.dto

import java.io.Serializable


data class TravelDTO(
    val id: Long?,
    val destination: String,
    val name: String,
    val code: String?,
    val startDate: String,
    val endDate: String,
    val imageUrl: String?,
    val days: Int,
    val travelDays: List<TravelDayDTO>?
) : Serializable