package com.tryply.model.entity

import com.tryply.model.enums.TravelerRole
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.ManyToOne

@Entity
class Traveler : TryPlyEntity() {
    @Enumerated(EnumType.STRING)
    var role : TravelerRole = TravelerRole.MEMBER

    @ManyToOne
    lateinit var user : User

    @ManyToOne
    lateinit var travel : Travel
}