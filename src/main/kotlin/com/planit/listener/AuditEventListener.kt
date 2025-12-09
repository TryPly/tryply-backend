package com.planit.listener
import com.planit.model.entity.PlanItEntity
import com.planit.security.SecurityContext
import jakarta.enterprise.context.Dependent
import jakarta.inject.Inject
import jakarta.persistence.PrePersist
import jakarta.persistence.PreUpdate

@Dependent
class AuditEntityListener @Inject constructor(
    private val securityContext: SecurityContext
) {

    @PrePersist
    fun onCreate(entity: Any) {
        if (entity is PlanItEntity) {
            val now = java.time.Instant.now()
            val user = securityContext.currentUserId() ?: "system"

            entity.createdBy = user
            entity.createdDate = now.toEpochMilli()
            entity.updatedBy = user
            entity.lastUpdateDate = now.toEpochMilli()
        }
    }

    @PreUpdate
    fun onUpdate(entity: Any) {
        if (entity is PlanItEntity) {
            val now = java.time.Instant.now()
            val user = securityContext.currentUserId() ?: "system"

            entity.updatedBy = user
            entity.lastUpdateDate = now.toEpochMilli()
        }
    }
}
