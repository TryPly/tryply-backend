package com.tryply.listener
import com.tryply.model.entity.TryPlyEntity
import com.tryply.security.SecurityContext
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
        if (entity is TryPlyEntity) {
            val now = java.time.Instant.now()
            val user = securityContext.currentUserId()

            entity.createdBy = user ?: "system"
            entity.createdDate = now.toEpochMilli()
            entity.updatedBy = user ?: "system"
            entity.lastUpdateDate = now.toEpochMilli()
        }
    }

    @PreUpdate
    fun onUpdate(entity: Any) {
        if (entity is TryPlyEntity) {
            val now = java.time.Instant.now()
            val user = securityContext.currentUserId()

            entity.updatedBy = user!!
            entity.lastUpdateDate = now.toEpochMilli()
        }
    }
}
