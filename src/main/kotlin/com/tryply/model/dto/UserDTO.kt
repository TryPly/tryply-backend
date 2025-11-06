package com.tryply.model.dto

import java.io.Serializable

data class UserDTO (
    val id: Long?,
    val username: String,
    val email: String,
    val firstName: String,
    val lastName: String,
    val profilePictureUrl: String?
) : Serializable