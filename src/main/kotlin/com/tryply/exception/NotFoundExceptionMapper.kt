package com.tryply.exception

import com.tryply.model.response.ErrorResponse
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.NotFoundException
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import jakarta.ws.rs.ext.ExceptionMapper
import jakarta.ws.rs.ext.Provider
import org.jboss.logging.Logger

@Provider
@ApplicationScoped
class NotFoundExceptionMapper : ExceptionMapper<NotFoundException> {

    private val log: Logger = Logger.getLogger(NotFoundExceptionMapper::class.java)

    override fun toResponse(exception: NotFoundException): Response {
        log.error("Unhandled error", exception)
        val body = ErrorResponse(
            status = Response.Status.NOT_FOUND.statusCode,
            error = "Not Found",
            message = exception.message
        )
        return Response.status(Response.Status.NOT_FOUND)
            .entity(body)
            .type(MediaType.APPLICATION_JSON)
            .build()
    }
}