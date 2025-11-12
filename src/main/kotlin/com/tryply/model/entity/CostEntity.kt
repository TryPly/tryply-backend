package com.tryply.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
class CostEntity : TryPlyEntity() {

    @OneToMany(mappedBy = "cost")
    var costs = mutableListOf<CostUnitEntity>()
    var name: String = ""
    var description: String = ""
    var amount : Double = 0.0
    var currency : String = "USD"

    @ManyToOne
    lateinit var travel : TravelEntity

}