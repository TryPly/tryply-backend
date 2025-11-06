package com.tryply.model.validator

import com.tryply.model.dto.UserDTO

open class UserValidator {

    fun validateUsername(username: String): Boolean {
        val usernameRegex = "^[a-zA-Z0-9_]{3,20}$".toRegex()
        return username.matches(usernameRegex)
    }

    fun validateEmail(email: String): Boolean {
        val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()
        return email.matches(emailRegex)
    }

    fun validateName(name: String): Boolean {
        return name.length in 1..50
    }

    fun validateProfilePictureUrl(url: String?): Boolean {
        if (url == null) return true
        val regex = "^(http|https)://.*\\.(jpg|jpeg|png|gif)$".toRegex(RegexOption.IGNORE_CASE)
        return url.matches(regex)
    }

    fun validateUserData(
        userDTO: UserDTO
    ): Boolean {
        return validateUsername(userDTO.username) &&
               validateEmail(userDTO.email) &&
               validateName(userDTO.firstName) &&
               validateName(userDTO.lastName) &&
               validateProfilePictureUrl(userDTO.profilePictureUrl)
    }

}