package com.planit.dto.user

data class UserDTO (
    val id: Long?,
    val keycloakId: String?,
    val username: String,
    val email: String,
    val firstName: String,
    val lastName: String,
    val profilePictureUrl: String?,
    val createDate: Long?,
    val lastUpdateDate: Long?,
)