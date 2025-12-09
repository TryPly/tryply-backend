package com.planit.security

import org.eclipse.microprofile.jwt.JsonWebToken
import jakarta.enterprise.context.RequestScoped
import jakarta.inject.Inject

@RequestScoped
class SecurityContext @Inject constructor(
    private val jwt: JsonWebToken
) {

    fun currentUserId(): String? = jwt.subject

    fun <T> claim(name: String): T? = jwt.getClaim(name)

    fun rawToken(): String? = jwt.rawToken
}
