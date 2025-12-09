package com.planit.security.model

data class AuthUserClaims (
    val userId: String,
    val email: String,
    val roles: List<String>
)