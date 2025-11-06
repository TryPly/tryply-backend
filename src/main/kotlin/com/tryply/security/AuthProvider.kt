package com.tryply.security

import com.tryply.security.model.AuthUserClaims

interface AuthProvider {
    fun validateToken(token: String): AuthUserClaims
}