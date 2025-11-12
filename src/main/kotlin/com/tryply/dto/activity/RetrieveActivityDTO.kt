package com.tryply.dto.activity

data class RetrieveActivityDTO(
    val travelId: Long?,
    val travelDayId: Long?,
    val name: String,
    val fromTime : String?,
    val toTime : String?,
    val completed : Boolean?,
)