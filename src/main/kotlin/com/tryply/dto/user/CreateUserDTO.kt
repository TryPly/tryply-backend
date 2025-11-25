package com.tryply.dto.user

data class CreateUserDTO (
    val keycloakId: String?,
    val username: String,
    val email: String,
    val firstName: String,
    val lastName: String,
)
