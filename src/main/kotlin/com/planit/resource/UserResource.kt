package com.planit.resource

import com.planit.dto.user.UserDTO
import com.planit.dto.user.CreateUserDTO
import com.planit.mapper.UserMapper
import com.planit.service.UserService
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import jakarta.transaction.Transactional
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType

@ApplicationScoped
@Path("/api/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
class UserResource {

    val userService: UserService
    val userMapper: UserMapper

    @Inject
    constructor(userService: UserService, userMapper: UserMapper) {
        this.userService = userService
        this.userMapper = userMapper
    }

    @POST
    @Path("/sync")
    fun createUser(userDTO: CreateUserDTO): UserDTO {
        val user = userMapper.toDTO(userDTO)
        return userService.createUser(user)
    }

    @GET
    fun getAllUsers(): List<UserDTO> {
        return userService.getAllUsers()
    }

    @GET
    @Path("/{userId}")
    fun getUserById(@PathParam("userId") userId: Long): UserDTO {
        return userService.getUserById(userId)
    }

}