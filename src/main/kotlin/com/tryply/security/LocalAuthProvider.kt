package com.tryply.security

//@ApplicationScoped
//class LocalAuthProvider @Inject constructor(
//    private val jwtParser: JWTParser
//) : AuthProvider {
//
//    override fun validateToken(token: String): AuthUserClaims {
//        try {
//            val jwt = jwtParser.parse(token)
//            val userId = jwt.subject ?: throw Exception("No subject")
//            val email = jwt.getClaim<String>("email")
//            val roles = jwt.getClaim<List<String>>("roles") ?: listOf("user")
//
//            return AuthUserClaims(userId, email, roles)
//        } catch (e: Exception) {
//            throw WebApplicationException(
//                "Invalid token",
//                Response.Status.UNAUTHORIZED
//            )
//        }
//    }
//}
