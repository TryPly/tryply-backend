package com.planit.exception

import jakarta.enterprise.context.ApplicationScoped
import jakarta.validation.ConstraintViolationException
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import jakarta.ws.rs.ext.ExceptionMapper
import jakarta.ws.rs.ext.Provider

@Provider
@ApplicationScoped
class ValidationExceptionMapper : ExceptionMapper<ConstraintViolationException> {
    override fun toResponse(exception: ConstraintViolationException): Response {
        val errors = exception.constraintViolations
            .map { it.propertyPath.toString() to it.message }
            .groupBy({ it.first }, { it.second })
            .mapValues { (_, v) -> v.joinToString("; ") }
        return Response.status(Response.Status.BAD_REQUEST)
            .entity(mapOf("errors" to errors))
            .type(MediaType.APPLICATION_JSON)
            .build()
    }
}