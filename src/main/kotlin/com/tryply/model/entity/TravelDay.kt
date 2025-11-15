package com.tryply.model.entity

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import kotlin.collections.mutableListOf

@Entity
class TravelDay : TryPlyEntity() {

    var name: String = ""
    @Column(columnDefinition = "TEXT")
    var description: String = ""
    var dayNumber : Int = 0

    @ManyToOne
    lateinit var travel : Travel
    @OneToMany(cascade = [(CascadeType.ALL)])
    var activityDayList = mutableListOf<ActivityDay>()

}