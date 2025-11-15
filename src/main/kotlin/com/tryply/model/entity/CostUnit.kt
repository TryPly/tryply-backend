package com.tryply.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

@Entity
class CostUnit : TryPlyEntity() {
    var amount : Double = 0.0
    var currency : String = "USD"
    var payed : Boolean = false

    @ManyToOne
    lateinit var traveler : Traveler
    @ManyToOne
    lateinit var cost : Cost

}