package com.tryply.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.ManyToMany
import jakarta.persistence.ManyToOne

@Entity
class CostUnitEntity : TryPlyEntity() {
    var amount : Double = 0.0
    var currency : String = "USD"
    var payed : Boolean = false

    @ManyToOne
    lateinit var traveler : TravelerEntity
    @ManyToOne
    lateinit var cost : CostEntity

}