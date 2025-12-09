package com.planit.model.entity

import com.planit.listener.AuditEntityListener
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditEntityListener::class)
open class PlanItEntity : PanacheEntity() {

    var createdDate : Long = System.currentTimeMillis()
    var lastUpdateDate : Long = System.currentTimeMillis()
    var createdBy : String = ""
    var updatedBy : String = ""

}