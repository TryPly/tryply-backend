package com.tryply.model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "users")
class User : TryPlyEntity() {

    @Column(unique = true, nullable = true)
    var keycloakId: String = ""
    @Column(unique = true, nullable = false)
    var username: String = ""
    var firstName: String = ""
    var lastName: String = ""
    @Column(unique = true, nullable = false)
    var email: String = ""
    var profilePictureUrl: String? = null

    override fun toString(): String {
        return "UserEntity(id=$id, username='$username', firstName='$firstName', lastName='$lastName', email='$email', profilePictureUrl=$profilePictureUrl)"
    }
}