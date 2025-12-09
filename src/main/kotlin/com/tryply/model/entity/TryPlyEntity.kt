package com.tryply.model.entity

import com.tryply.listener.AuditEntityListener
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.PostPersist
import jakarta.persistence.PrePersist

@MappedSuperclass
@EntityListeners(AuditEntityListener::class)
open class TryPlyEntity : PanacheEntity() {

    var createdDate : Long = System.currentTimeMillis()
    var lastUpdateDate : Long = System.currentTimeMillis()
    var createdBy : String = ""
    var updatedBy : String = ""

}