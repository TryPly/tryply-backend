package com.planit.security

import com.planit.security.model.AuthUserClaims

interface AuthProvider {
    fun validateToken(token: String): AuthUserClaims
}