package com.tryply.dto.user

data class CreateUserDTO (
    val username: String,
    val email: String,
    val firstName: String,
    val lastName: String,
    val profilePictureUrl: String?,
)
