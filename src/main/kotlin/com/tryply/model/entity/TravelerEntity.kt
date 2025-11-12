package com.tryply.model.entity

import com.tryply.model.enums.TravelerRole
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToOne

@Entity
class TravelerEntity : TryPlyEntity() {
    @Enumerated(EnumType.STRING)
    var role : TravelerRole = TravelerRole.MEMBER

    @ManyToOne
    lateinit var user : UserEntity

    @ManyToOne
    lateinit var travel : TravelEntity
}