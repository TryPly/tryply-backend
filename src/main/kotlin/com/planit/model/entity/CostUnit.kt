package com.planit.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

@Entity
class CostUnit : PlanItEntity() {
    var amount : Double = 0.0
    var currency : String = "USD"

    @ManyToOne
    lateinit var traveler : Traveler
    @ManyToOne
    lateinit var cost : Cost

}