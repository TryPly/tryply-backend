package com.tryply.model.entity

import com.tryply.model.enums.CostType
import jakarta.persistence.*

@Entity
@Table(name = "costs")
/**
 * Entity that represents a cost incurred during a travel.
 * @field payer is the traveler who paid for the cost.
 * @field travel is the travel associated with the cost.
 * @field costs is the list of cost units associated with the cost.
 */
class Cost : TryPlyEntity() {

    var reason: String = ""
    var amount : Double = 0.0
    var currency : String = "USD"
    var date : Long = 0

    @Enumerated(EnumType.STRING)
    var costType : CostType = CostType.COST

    @ManyToOne
    lateinit var payer : Traveler

    @ManyToOne
    lateinit var travel : Travel

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "cost", orphanRemoval = true)
    lateinit var costs : MutableList<CostUnit>

}