package com.tryply.service

import com.tryply.dto.UserDTO
import com.tryply.model.entity.UserEntity
import com.tryply.repository.UserRepository
import com.tryply.validator.UserValidator
import io.vertx.core.impl.logging.LoggerFactory
import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional
import jakarta.ws.rs.NotFoundException

@ApplicationScoped
@Transactional
class UserService {
    val logger = LoggerFactory.getLogger(UserService::class.java)
    val userRepository = UserRepository()

    fun createUser(userDTO: UserDTO): UserDTO {

        logger.info("Creating user: ${userDTO.username}")
        val validator = UserValidator()
        validator.validateUserData(userDTO)

        userRepository.find("email", userDTO.email).firstResult()?.let {
            throw IllegalArgumentException("Email already in use")
        }
        userRepository.find("username", userDTO.username).firstResult()?.let {
            throw IllegalArgumentException("Username already in use")
        }

        val user = UserEntity().apply {
            username = userDTO.username
            email = userDTO.email
            firstName = userDTO.firstName
            lastName = userDTO.lastName
            profilePictureUrl = userDTO.profilePictureUrl
        }

        user.persist()
        logger.info("Created user: ${userDTO.username}")
        return UserDTO(
            id = user.id,
            username = user.username,
            email = user.email,
            firstName = user.firstName,
            lastName = user.lastName,
            profilePictureUrl = user.profilePictureUrl,
            createDate = user.createdDate,
            lastUpdateDate = user.lastUpdateDate
        )
    }

    fun getAllUsers(): List<UserDTO> {
        return userRepository.listAll().map { user ->
            UserDTO(
                id = user.id,
                username = user.username,
                email = user.email,
                firstName = user.firstName,
                lastName = user.lastName,
                profilePictureUrl = user.profilePictureUrl,
                createDate = user.createdDate,
                lastUpdateDate = user.lastUpdateDate
            )
        }
    }

    fun getUserById(userId: Long): UserDTO {
        val user = userRepository.findById(userId) ?: throw NotFoundException("User with id $userId not found")
        return UserDTO(
            id = user.id,
            username = user.username,
            email = user.email,
            firstName = user.firstName,
            lastName = user.lastName,
            profilePictureUrl = user.profilePictureUrl,
            createDate = user.createdDate,
            lastUpdateDate = user.lastUpdateDate
        )
    }
}