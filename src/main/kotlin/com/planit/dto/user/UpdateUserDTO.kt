package com.planit.dto.user

data class UpdateUserDTO(
    val username: String,
    val email: String,
    val firstName: String,
    val lastName: String,
    val profilePictureUrl: String?,
)
