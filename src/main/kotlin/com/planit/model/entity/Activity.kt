package com.planit.model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity
class Activity : PlanItEntity() {
    var name: String = ""
    @Column(columnDefinition = "TEXT")
    var description: String = ""
    var completed: Boolean = false

    @ManyToOne
    @JoinColumn(name = "travel_id")
    var travel : Travel? = null
}