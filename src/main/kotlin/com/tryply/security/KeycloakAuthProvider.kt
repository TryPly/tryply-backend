package com.tryply.security

//@ApplicationScoped
//class KeycloakAuthProvider @Inject constructor(
//    private val jwt: JsonWebToken
//) : AuthProvider {
//
//    override fun validateToken(token: String): AuthUserClaims {
//        if (!jwt.claimNames.contains("preferred_username")) {
//            throw WebApplicationException("Invalid Keycloak token", Response.Status.UNAUTHORIZED)
//        }
//        val userId = jwt.subject
//        val email = jwt.claim<String>("email").orElse(null)
//        val roles = jwt.groups.toList()
//
//        return AuthUserClaims(userId, email, roles)
//    }
//}
